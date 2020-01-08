package cn.lonsun.appDistribution.model

const val APP_TYPENAME_ANDROID = "Android"
const val APP_TYPENAME_IOS = "IOS"

data class AppInfo(
    var id: Int,
    var bundleId: String,
    var type: String,
    var appId:String
)
