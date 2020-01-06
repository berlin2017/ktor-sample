package cn.lonsun.appDistribution

import cn.lonsun.appDistribution.model.APP_TYPENAME_ANDROID
import cn.lonsun.appDistribution.model.AppInfo
import cn.lonsun.appDistribution.model.AppItem
import io.ktor.application.call
import io.ktor.freemarker.FreeMarkerContent
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get

const val APP_PATH = "app"
fun Route.appRoute(){

    get(APP_PATH){
        val list = mutableListOf<AppInfo>()
        for (i in 0..6) {
            val apps = mutableListOf<AppItem>()
            for( j in 0..3){
                apps.add(AppItem("1.0.6",202001061,"pgyer.com/U4aj","2020-01-06 10:00"))
            }
            list.add(AppInfo(i,"安徽新媒体", APP_TYPENAME_ANDROID,apps))
        }
        call.respond(FreeMarkerContent("appIndex.ftl", mapOf("data" to list), ""))
    }


}