package cn.lonsun

import io.ktor.application.ApplicationCall
import io.ktor.response.respond

suspend fun ApplicationCall.respond(status: Int = 1, data: Any? = null, message: String = "") {
    respond(RespondData(status, data, message))
}

suspend fun ApplicationCall.respondSuccess(status: Int = 1, data: Any? = null, message: String = "") {
    respond(RespondData(status, data, message))
}

suspend fun ApplicationCall.respondError(status: Int = 0, data: Any? = null, message: String = "") {
    respond(RespondData(status, data, message))
}

data class RespondData(var status: Int = 0, var data: Any? = null, var message: String? = "")
