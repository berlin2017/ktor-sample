package cn.lonsun.appDistribution

import cn.lonsun.*
import cn.lonsun.appDistribution.dao.AppItems
import cn.lonsun.appDistribution.dao.Apps
import cn.lonsun.appDistribution.model.*
import io.ktor.application.call
import io.ktor.freemarker.FreeMarkerContent
import io.ktor.http.Parameters
import io.ktor.http.content.PartData
import io.ktor.http.content.forEachPart
import io.ktor.http.content.streamProvider
import io.ktor.request.receive
import io.ktor.request.receiveMultipart
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.route
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.yield
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.SortOrder
import org.jetbrains.exposed.sql.and
import org.jetbrains.exposed.sql.transactions.transaction
import org.joda.time.DateTime
import java.io.InputStream
import java.io.OutputStream

const val APP_PATH = "app"
fun Route.appRoute() {

    get(APP_PATH) {
        val list = mutableListOf<AppInfo>()
        Database.connect(DB_URL, JDBC_DRIVER, DB_USER, DB_PASSWORD)
        transaction {
            SchemaUtils.create(Apps)
            SchemaUtils.create(AppItems)
            val apps = AppsDao.all()
            apps.forEach { app ->
                val appInfo = app.toModel()
                val appItems =
                    AppItemDao.find { (AppItems.appId eq app.appId) and (AppItems.isPublished eq true) }
                        .orderBy(Pair(AppItems.versionCode, SortOrder.DESC))
                        .orderBy(Pair(AppItems.publishTime, SortOrder.DESC))
                val apps = mutableListOf<AppItem>()
                appItems.forEach {
                    apps.add(it.toModel())
                }
                appInfo.apps = apps
                list.add(appInfo)
            }
        }

        call.respond(FreeMarkerContent("appIndex.ftl", mapOf("data" to list), ""))
    }

    route("$APP_PATH/upload") {
        get {
            call.respond(FreeMarkerContent("appUpload.ftl", null))
        }

        post {
            call.upload()
        }
    }


    post("$APP_PATH/getAppInfo") {
        Database.connect(DB_URL, JDBC_DRIVER, DB_USER, DB_PASSWORD)
        val params = call.receive<Parameters>()
        val type = params["type"]
        val id = params["bundleId"]
        if (type != APP_TYPENAME_ANDROID && type != APP_TYPENAME_IOS) {
            call.respondError(message = "类型不正确")
            return@post
        }
        if (id.isNullOrBlank()) {
            call.respondError(message = "id不能为空")
            return@post
        }
        val appInfo = getAppInfo(id, type)
        call.respondSuccess(data = appInfo?.toModel())
    }

    post("$APP_PATH/saveAppItem") {
        val multipart = call.receiveMultipart()
        var appId = ""
        var versionName = ""
        var versionCode = 0
        var path = ""
        var appName = ""
        var icon: String? = null
        var filePart: PartData.FileItem? = null
        multipart.forEachPart { part ->
            when (part) {
                is PartData.FormItem -> {
                    if (part.name == "appId") {
                        appId = part.value
                    }
                    if (part.name == "versionName") {
                        versionName = part.value
                    }
                    if (part.name == "versionCode") {
                        versionCode = part.value.toInt()
                    }
                    if (part.name == "path") {
                        path = part.value
                    }
                    if (part.name == "appName") {
                        appName = part.value
                    }
                }
                is PartData.FileItem -> {
                    if (part.name == "icon") {
                        filePart = part
                    }

                }
            }
        }
        filePart?.let {
            it.streamProvider().use { input ->
                icon = input.let { it1 -> storeFile2Ftp("icons", filePart?.originalFileName!!, it1)?.filePath }
            }
        }

        Database.connect(DB_URL, JDBC_DRIVER, DB_USER, DB_PASSWORD)
        var appItem: AppItemDao? = null
        transaction {
            SchemaUtils.create(AppItems)
            appItem = AppItemDao.new {
                this.appId = appId
                this.versionCode = versionCode
                this.versionName = versionName
                this.path = path
                this.appName = appName
                this.icon = icon
            }
        }
        call.respondSuccess(data = appItem?.toModel())
    }

    route("$APP_PATH/publish") {
        get {
            Database.connect(DB_URL, JDBC_DRIVER, DB_USER, DB_PASSWORD)
            val id = call.parameters["id"]
            if (!id.isNullOrBlank()) {
                var result: AppItemDao? = null
                transaction {
                    SchemaUtils.create(AppItems)
                    result = AppItemDao.findById(id = id.toInt())
                }
                call.respond(FreeMarkerContent("appPublish.ftl", mapOf("data" to result?.toModel())))
            }
        }

        post {
            Database.connect(DB_URL, JDBC_DRIVER, DB_USER, DB_PASSWORD)
            val params = call.receive<Parameters>()
            val id = params["id"]
            val updateDesc = params["updateDesc"]
            val appInfo = params["appInfo"]
            if (!id.isNullOrBlank()) {
                var result: AppItemDao? = null
                transaction {
                    SchemaUtils.create(AppItems)
                    result = AppItemDao.findById(id = id.toInt())
                    result?.updateDesc = updateDesc
                    result?.appInfo = appInfo
                    result?.publishTime = DateTime.now().millis
                    result?.isPublished = true
                }
                call.respondSuccess(data = result?.toModel())
            }
        }
    }



    get("$APP_PATH/getAppItem") {
        val id = call.parameters["id"]
        if (!id.isNullOrBlank()) {
            var result: AppItemDao? = null
            transaction {
                SchemaUtils.create(AppItems)
                result = AppItemDao.findById(id = id!!.toInt())
            }
            call.respondSuccess(data = result?.toModel())
        }

    }

    get("$APP_PATH/detail") {
        call.respond(FreeMarkerContent("appDetail.ftl", null))
    }

    get("$APP_PATH/download/{appId}") {
        val appId = call.parameters["appId"]
        if (appId == null) {
            call.respondError(message = "参数appId为空")
            return@get
        }
        var appInfo:AppInfo? = null
        Database.connect(DB_URL, JDBC_DRIVER, DB_USER, DB_PASSWORD)
        transaction {
            SchemaUtils.create(Apps)
            SchemaUtils.create(AppItems)
            val apps = AppsDao.find { Apps.appId eq appId }
            if (apps.empty() || apps.count() != 1) {
                return@transaction
            }
            appInfo = apps.first().toModel()
            val appItems =
                AppItemDao.find { (AppItems.appId eq appInfo!!.appId) and (AppItems.isPublished eq true) }
                    .orderBy(Pair(AppItems.versionCode, SortOrder.DESC))
                    .orderBy(Pair(AppItems.publishTime, SortOrder.DESC))
            val appItemModels = mutableListOf<AppItem>()
            appItems.forEach {
                appItemModels.add(it.toModel())
            }
            appInfo?.apps = appItemModels
        }

        call.respond(FreeMarkerContent("appDownload.ftl", mapOf("data" to appInfo), ""))
    }
}


suspend fun InputStream.copyToSuspend(
    out: OutputStream,
    bufferSize: Int = DEFAULT_BUFFER_SIZE,
    yieldSize: Int = 4 * 1024 * 1024,
    dispatcher: CoroutineDispatcher = Dispatchers.IO
): Long {
    return withContext(dispatcher) {
        val buffer = ByteArray(bufferSize)
        var bytesCopied = 0L
        var bytesAfterYield = 0L
        while (true) {
            val bytes = read(buffer).takeIf { it >= 0 } ?: break
            out.write(buffer, 0, bytes)
            if (bytesAfterYield >= yieldSize) {
                yield()
                bytesAfterYield %= yieldSize
            }
            bytesCopied += bytes
            bytesAfterYield += bytes
        }
        return@withContext bytesCopied
    }
}

private fun getAppInfo(bundleId: String, type: String): AppsDao? {
    var result: AppsDao? = null
    transaction {
        SchemaUtils.create(Apps)
        result = AppsDao.find { (Apps.type eq type) and (Apps.bundleId eq bundleId) }.firstOrNull()
    }
    return if (result != null) {
        result
    } else {
        creatApp(bundleId, type)
    }
}

private fun creatApp(bundleId: String, type: String): AppsDao? {
    var result: AppsDao? = null
    transaction {
        SchemaUtils.create(Apps)
        result = AppsDao.new {
            this.type = type
            this.bundleId = bundleId
            this.appId = creatAppId(bundleId)
        }
    }
    return result
}