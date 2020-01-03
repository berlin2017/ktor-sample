package cn.lonsun.user

import cn.lonsun.*
import cn.lonsun.dao.Users
import cn.lonsun.dao.UserDao
import io.ktor.application.ApplicationCall
import io.ktor.application.call
import io.ktor.freemarker.FreeMarkerContent
import io.ktor.http.Parameters
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.route
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.StdOutSqlLogger
import org.jetbrains.exposed.sql.addLogger
import org.jetbrains.exposed.sql.transactions.transaction


const val USER_PATH = "user"
fun Route.user() {

    post("$USER_PATH/isUserExist") {
        Database.connect(DB_URL, JDBC_DRIVER, DB_USER, DB_PASSWORD)
        val params = call.receive<Parameters>()
        val usernameP = params["username"]
        if (isUserExist(usernameP!!)) {
            call.respond(mapOf("status" to 0, "message" to "用户已存在"))
        } else {
            call.respond(mapOf("status" to 1, "message" to "用户不存在"))
        }
    }

    route("$USER_PATH/register") {
        get {
            call.respond(FreeMarkerContent("register.ftl", null, ""))
        }

        post {
            Database.connect(DB_URL, JDBC_DRIVER, DB_USER, DB_PASSWORD)
            val params = call.receive<Parameters>()
            val usernameP = params["username"]
            val passwordP = params["password"]
            val emailP = params["email"]
            if (!validParams(params, call)) return@post
            if (isUserExist(usernameP!!)) {
                call.respond(mapOf("status" to 0, "message" to "注册失败,用户已存在"))
                return@post
            }
            transaction {
                addLogger(StdOutSqlLogger)
                UserDao.new {
                    username = usernameP
                    password = passwordP!!
                    email = emailP
                }

            }
            call.respond(mapOf("status" to 1, "message" to "注册成功"))
        }
    }

    post("$USER_PATH/login") {
        Database.connect(DB_URL, JDBC_DRIVER, DB_USER, DB_PASSWORD)
        val params = call.receive<Parameters>()
        val usernameP = params["username"]
        val passwordP = params["password"]
        if (!validParams(params, call)) return@post
        var user: UserDao? = null
        transaction {
            addLogger(StdOutSqlLogger)
            user = UserDao.find { Users.username eq usernameP!! }.firstOrNull()
        }
        if (user == null) {
            call.respondError(message = "用户名不存在")
            return@post
        }
        if (user?.password == passwordP) {
            call.respondSuccess(message = "登录成功", data = user?.toModel())
        } else {
            call.respondError(message = "密码错误")
        }
    }
}

private suspend fun validParams(params: Parameters, call: ApplicationCall): Boolean {
    val username = params["username"]
    val password = params["password"]
    val userServices = UserServices()
    val validName = userServices.validUserName(username)
    if (!validName.first) {
        call.respond(mapOf("status" to 0, "message" to validName.second))
        return false
    }
    val validPass = userServices.validPassword(password)
    if (!validPass.first) {
        call.respond(mapOf("status" to 0, "message" to validPass.second))
        return false
    }
    return true
}

private fun isUserExist(userName: String): Boolean {
    var result: UserDao? = null
    transaction {
        SchemaUtils.create(Users)
        result = UserDao.find { Users.username eq userName }.firstOrNull()
    }
    return result != null
}

