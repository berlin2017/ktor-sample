package cn.lonsun.appDistribution.model

import cn.lonsun.appDistribution.dao.AppItems
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class AppItemDao(id: EntityID<Int>) : IntEntity(id) {

    companion object : IntEntityClass<AppItemDao>(AppItems)

    var appName by AppItems.appName
    var versionName by AppItems.versionName
    var versionCode by AppItems.versionCode
    var path by AppItems.path
    var appInfo by AppItems.appInfo
    var updateDesc by AppItems.updateDesc
    var publishTime by AppItems.publishTime
    var appId by AppItems.appId
    var isPublished by AppItems.isPublished
    var icon by AppItems.icon


    fun toModel() = AppItem(
        versionName = versionName,
        versionCode = versionCode,
        path = path,
        time = publishTime,
        id = id.value,
        appInfo = appInfo,
        appName = appName,
        updateDesc = updateDesc,
        appId = appId,
        isPublished = isPublished,
        icon = icon
    )

}