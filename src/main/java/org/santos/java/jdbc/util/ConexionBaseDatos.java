package org.santos.java.jdbc.util;

import java.lang.constant.Constable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {
    private static String url = "jdbc:mysql://localhost:3306/" +
            "proyectomantenedorusuariosjdbc?serverTimezone=America";
    private static String username = "root";
    private static String password = "root";

    private static Connection connection;

    public static Connection getIntance() throws SQLException {
        if(connection==null){
            connection = DriverManager.getConnection(url,username,password);
        }
        return connection;
    }

}
