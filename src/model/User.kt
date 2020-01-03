package cn.lonsun.model

class User(
    var id: Int,
    var password: String,
    var email: String? = null,
    var username: String
)