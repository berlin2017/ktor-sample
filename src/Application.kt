package cn.lonsun

import cn.lonsun.about.about
import cn.lonsun.appDistribution.appRoute
import cn.lonsun.user.user
import freemarker.cache.ClassTemplateLoader
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.auth.Authentication
import io.ktor.features.ContentNegotiation
import io.ktor.features.DefaultHeaders
import io.ktor.freemarker.FreeMarker
import io.ktor.freemarker.FreeMarkerContent
import io.ktor.gson.gson
import io.ktor.html.respondHtml
import io.ktor.http.ContentType
import io.ktor.http.content.file
import io.ktor.http.content.files
import io.ktor.http.content.static
import io.ktor.http.content.staticRootFolder
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import kotlinx.html.body
import kotlinx.html.h1
import kotlinx.html.li
import kotlinx.html.ul
import java.io.File

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    install(DefaultHeaders)

    install(FreeMarker) {
        templateLoader = ClassTemplateLoader(this::class.java.classLoader, "templates")
        defaultEncoding = "utf-8"
    }

    install(Authentication) {
    }

    install(ContentNegotiation) {
        gson {
        }
    }

    routing {

        static("dist/js") {
            staticRootFolder = File("dist")
            files("js")
        }

        static("dist/css") {
            staticRootFolder = File("dist")
            files("css")
        }

        static("static") {
            staticRootFolder = File("dist")
            file("login_bg_left.png")
            file("login_bg_right.png")
        }

        get("/") {
            call.respondText("HELLO WORLD!", contentType = ContentType.Text.Plain)
        }

        get("/html-dsl") {
            call.respondHtml {
                body {
                    h1 { +"HTML" }
                    ul {
                        for (n in 1..10) {
                            li { +"$n" }
                        }
                    }
                }
            }
        }

        get("/html-freemarker") {
            val list = mutableListOf<Int>()
            for (i in 0..100) {
                list.add(i)
            }
            call.respond(FreeMarkerContent("index.ftl", mapOf("data" to IndexData(list)), ""))
        }

        get("/json/gson") {
            call.respond(mapOf("hello" to "world"))
        }


        user()

        appRoute()

        about()

    }
}


data class IndexData(val items: List<Int>)

