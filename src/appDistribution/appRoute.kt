package cn.lonsun.appDistribution

import cn.lonsun.appDistribution.model.APP_TYPENAME_ANDROID
import cn.lonsun.appDistribution.model.AppInfo
import cn.lonsun.appDistribution.model.AppItem
import cn.lonsun.respondSuccess
import io.ktor.application.call
import io.ktor.freemarker.FreeMarkerContent
import io.ktor.http.content.PartData
import io.ktor.http.content.forEachPart
import io.ktor.http.content.streamProvider
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
import java.io.File
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream

const val APP_PATH = "app"
const val uploadDir = "/files"
fun Route.appRoute() {

    get(APP_PATH) {
        val list = mutableListOf<AppInfo>()
        for (i in 0..6) {
            val apps = mutableListOf<AppItem>()
            for (j in 0..3) {
                apps.add(AppItem("1.0.6", 202001061, "pgyer.com/U4aj", "2020-01-06 10:00"))
            }
            list.add(AppInfo(i, "安徽新媒体", APP_TYPENAME_ANDROID, apps))
        }
        call.respond(FreeMarkerContent("appIndex.ftl", mapOf("data" to list), ""))
    }

    route("$APP_PATH/upload") {
        get {
            call.respond(FreeMarkerContent("appUpload.ftl", null))
        }

        post {
            val multipart = call.receiveMultipart()
            var title = ""
            multipart.forEachPart { part ->
                when (part) {
                    is PartData.FormItem -> {
                        if (part.name == "title") {
                            title = part.value
                        }
                    }
                    is PartData.FileItem -> {
                        val ext = File(part.originalFileName).extension
                        val uploadDir = File(uploadDir)
                        if (!uploadDir.mkdirs() && !uploadDir.exists()) {
                            throw IOException("Failed to create directory ${uploadDir.absolutePath}")
                        }
                        val file = File(uploadDir, "${part.originalFileName}")
                        part.streamProvider().use { input ->
                            file.outputStream().buffered().use { output -> input.copyToSuspend(output) }
                        }
                    }
                }

                part.dispose()
            }
            call.respondSuccess(message = "上传成功")
        }
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