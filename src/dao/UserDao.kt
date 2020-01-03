package cn.lonsun.dao

import cn.lonsun.model.User
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class UserDao(id: EntityID<Int>) : IntEntity(id) {

    companion object : IntEntityClass<UserDao>(Users)

    var password by Users.password
    var email by Users.email
    var username by Users.username

    fun toModel(): User {
        return User(id = id.value, username = username, password = password, email = email)
    }
}
