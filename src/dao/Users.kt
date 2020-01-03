package cn.lonsun.dao

import org.jetbrains.exposed.dao.id.IntIdTable

object Users : IntIdTable() {
    var password = varchar("password", 50)
    var email = varchar("email", 50).nullable()
    var username = varchar("username",50)
}
