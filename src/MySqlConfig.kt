package cn.lonsun

import java.sql.Connection
import java.sql.DriverManager

const val JDBC_DRIVER = "com.mysql.jdbc.Driver"
const val DB_URL = "jdbc:mysql://localhost:3306/lonsun?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8"
const val DB_USER = "root"
const val DB_PASSWORD = "root"

fun connectDB(
    databaseUrl: String = DB_URL,
    databaseDriver: String = JDBC_DRIVER,
    databaseUser: String = DB_USER,
    databaseUserPassword: String = DB_PASSWORD
): Connection {
    Class.forName(JDBC_DRIVER)
    return DriverManager.getConnection(
        DB_URL,
        DB_USER,
        DB_PASSWORD
    )
}