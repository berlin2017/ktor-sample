package cn.lonsun

import io.ktor.application.ApplicationCall
import io.ktor.http.content.PartData
import io.ktor.http.content.forEachPart
import io.ktor.http.content.streamProvider
import io.ktor.request.receiveMultipart
import io.ktor.response.respond
import org.apache.commons.net.ftp.FTPClient
import sun.net.ftp.impl.FtpClient
import sun.nio.cs.ext.GBK
import java.io.File
import java.io.InputStream
import java.net.InetSocketAddress
import java.nio.charset.Charset

suspend fun ApplicationCall.respond(status: Int = 1, data: Any? = null, message: String = "") {
    respond(RespondData(status, data, message))
}

suspend fun ApplicationCall.respondSuccess(status: Int = 1, data: Any? = null, message: String = "") {
    respond(RespondData(status, data, message))
}

suspend fun ApplicationCall.respondError(status: Int = 0, data: Any? = null, message: String = "") {
    respond(RespondData(status, data, message))
}

data class RespondData(var status: Int = 0, var data: Any? = null, var message: String? = "")


data class FileItem(var fileName: String, var filePath: String, var fileSize: Long)


/**
 * 上传
 */
suspend fun ApplicationCall.upload() {
    val multipart = receiveMultipart()
    val fileParts = mutableListOf<PartData.FileItem>()
    val filePaths = mutableListOf<FileItem>()
    var uploadDir = ""
    multipart.forEachPart {
        when (it) {
            is PartData.FileItem -> {
                fileParts.add(it)
            }
            is PartData.FormItem -> {
                if (it.name == "dir") {
                    uploadDir = it.value
                }
            }
        }
    }
    fileParts.forEach { filePart ->
        filePart.streamProvider().use { input ->
            filePart.originalFileName?.let { it1 ->
                storeFile2Ftp(uploadDir, it1, input)?.let { filePaths.add(it) }
            }
        }
    }
    respondSuccess(message = "上传成功", data = filePaths)
}

fun storeFile2Ftp(directory: String, fileName: String, inputStream: InputStream): FileItem? {
    val ftpClient = connectFtp()
    return ftpClient.uploadFile2Ftp(inputStream, fileName, directory)

}
