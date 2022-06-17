package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
    private static Connection instance;


    private final static String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=Zekarias_Goitom_P1";
    private final static String user = "postgres";
    private final static String password = "1234";


    public static Connection getConnection() throws SQLException {

        if(instance == null || instance.isClosed()){ // we have not yet created a connection

//            Class.forName("org.postgresql.Driver");
            instance = DriverManager.getConnection(url, user, password);
        }
        return instance;
    }

    private ConnectionUtility(){

    }


}
