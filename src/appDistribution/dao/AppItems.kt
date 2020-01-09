package cn.lonsun.appDistribution.dao

import org.jetbrains.exposed.dao.id.IntIdTable

object AppItems :IntIdTable(){
    var path = varchar("filePath",200)
    var versionCode = integer("versionCode")
    var versionName = varchar("versionName",50)
    var publishTime = long("publishTime").default(0L)
    var appName = varchar("appName",50)
    var updateDesc = varchar("updateDesc",200).nullable()
    var appInfo = varchar("appInfo",200).nullable()
    var icon = varchar("icon",200).nullable()
    var appId = varchar("appId",50)
    var isPublished = bool("isPublished").default(false)
}