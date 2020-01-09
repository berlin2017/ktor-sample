package cn.lonsun

import java.util.logging.Logger

fun info(message:String){
    getLogger().info(message)
}

fun warning(message: String){
    getLogger().warning(message)
}

fun getLogger() = Logger.getLogger("berlin ktor")