package com.gabriel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author 1972037 Gabriel Octa Mahardika
 **/
public class MySQLConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/demodb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root123";

    public static Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        connection.setAutoCommit(false);
        return connection;
    }
}
