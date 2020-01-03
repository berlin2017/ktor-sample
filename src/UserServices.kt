package cn.lonsun

class UserServices {

    fun validUserName(username: String?): Pair<Boolean, String> {
        var isCorrect = true
        var message = ""
        if (username.isNullOrBlank()) {
            isCorrect = false
            message = "用户名不能为空"
        }
        return Pair(isCorrect, message)
    }

    fun validPassword(username: String?): Pair<Boolean, String> {
        var isCorrect = true
        var message = ""
        if (username.isNullOrBlank()) {
            isCorrect = false
            message = "密码不能为空"
        }
        return Pair(isCorrect, message)
    }
}