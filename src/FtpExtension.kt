package cn.lonsun

import org.apache.commons.net.ftp.FTPClient
import org.apache.commons.net.ftp.FTPFile
import org.apache.commons.net.ftp.FTPReply
import java.io.File
import java.io.IOException
import java.io.InputStream

fun connectFtp(): FTPClient {
    val ftpClient: FTPClient?
    ftpClient = FTPClient()
    ftpClient.connect(FTP_HOST, FTP_PORT)
    ftpClient.login(FTP_USERNAME, FTP_PASSWORD)
    // 设置连接超时时间,5000毫秒
    ftpClient.connectTimeout = 50000
    // 设置中文编码集，防止中文乱码
    ftpClient.controlEncoding = "UTF-8"
    if (!FTPReply.isPositiveCompletion(ftpClient.replyCode)) {
        info("未连接到FTP，用户名或密码错误")
        ftpClient.disconnect()
    } else {
        info("FTP连接成功")
    }
    return ftpClient
}

/**
 * 关闭FTP方法
 * @param ftp
 * @return
 */
fun FTPClient.closeFTP(): Boolean {

    try {
        logout()
    } catch (e: Exception) {
        warning("FTP关闭失败")
    } finally {
        if (isConnected) {
            try {
                disconnect()
            } catch (ioe: IOException) {
                warning("FTP关闭失败")
            }

        }
    }

    return false
}

fun FTPClient.uploadFile2Ftp(inputStream: InputStream, fileName: String, dir: String): FileItem? {
    enterLocalPassiveMode()
    setFileType(FTPClient.BINARY_FILE_TYPE)
    //判断FPT目标文件夹时候存在不存在则创建
    if (!changeWorkingDirectory(dir)) {
        makeDirectory(dir)
    }

    changeWorkingDirectory(dir)
    val isSuccess = storeFile(String(fileName.toByteArray(charset("GBK")), Charsets.ISO_8859_1), inputStream)
    if (isSuccess) {
        info("上传成功")
        val file = getCurrentDirFile(fileName)
        if (file != null) {
            return FileItem(fileName, FILE_SERVER + File.separator + dir + File.separator + fileName, file.size)
        }
    } else {
        info("上传失败")
    }
    return null
}

fun FTPClient.getCurrentDirFile(fileName: String): FTPFile? {

    val files = listFiles(fileName)
    if (files.isEmpty()) {
        warning("路径或文件不存在")
        return null
    }

    return files[0]
}





