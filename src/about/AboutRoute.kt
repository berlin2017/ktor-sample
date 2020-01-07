package cn.lonsun.about

import io.ktor.application.call
import io.ktor.freemarker.FreeMarkerContent
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get

const val ABOUT_PATH = "about"
fun Route.about(){

    get("$ABOUT_PATH/rules"){
        call.respond(FreeMarkerContent("rule.ftl", null))
    }
}