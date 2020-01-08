package cn.lonsun.appDistribution.model


import cn.lonsun.appDistribution.dao.Apps
import org.apache.commons.codec.digest.Md5Crypt
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import java.security.MessageDigest
import java.math.BigInteger
import java.security.NoSuchAlgorithmException



class AppsDao(id: EntityID<Int>) : IntEntity(id) {

    companion object : IntEntityClass<AppsDao>(Apps)

    var bundleId by Apps.bundleId
    var type by Apps.type
    var appId by Apps.appId

    fun toModel(): AppInfo {
        return AppInfo(id = id.value, bundleId = bundleId, type = type,appId = appId)
    }

}

fun creatAppId(bundleId: String) = stringToMD5(bundleId)

fun stringToMD5(plainText: String): String {
    var secretBytes: ByteArray? = null
    try {
        secretBytes = MessageDigest.getInstance("md5").digest(
            plainText.toByteArray()
        )
    } catch (e: NoSuchAlgorithmException) {
        throw RuntimeException("没有这个md5算法！")
    }

    var md5code = BigInteger(1, secretBytes!!).toString(16)
    for (i in 0 until 32 - md5code.length) {
        md5code = "0$md5code"
    }
    return md5code
}


