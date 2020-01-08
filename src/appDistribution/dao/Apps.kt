package cn.lonsun.appDistribution.dao

import org.jetbrains.exposed.dao.id.IntIdTable

object Apps : IntIdTable() {

    var bundleId = varchar("bundleId", 50)
    var type = varchar("type", 50)
    var appId = varchar("appId",50)
}