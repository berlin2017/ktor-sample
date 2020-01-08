package cn.lonsun.appDistribution.model

data class AppItem(
    var id:Int,
    var versionName:String,
    var versionCode:Int,
    var path:String,
    var time:Long,
    var appName:String,
    var appInfo:String?,
    var updateDesc:String?,
    var appId:String,
    var icon:String?,
    var isPublished:Boolean = false
)