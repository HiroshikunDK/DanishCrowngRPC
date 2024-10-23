package org.example.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DatabaseConnection {
    private static final String URL ="jdbc:postgresql://localhost:5433/DanishCrownDB";
    private static final String USER = "postgres";
    private static final String PASSWORD = "thomas123456";


    public Connection getConnection() {
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

}


