package org.example.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;


@Component
public class DatabaseHelper<T> {
    private final String jdbcURL;
    private final String username;
    private final String password;

    public DatabaseHelper(@Value("${jdbc.url}") String jdbcURL,
                          @Value("${jdbc.username}") String username,
                          @Value("${jdbc.password}") String password) throws SQLException {
        this.jdbcURL = jdbcURL;
        this.password = password;
        this.username = username;
        DriverManager.registerDriver(new Driver() {
            @Override
            public Connection connect(String url, Properties info) throws SQLException {
                return null;
            }

            @Override
            public boolean acceptsURL(String url) throws SQLException {
                return false;
            }

            @Override
            public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                return new DriverPropertyInfo[0];
            }

            @Override
            public int getMajorVersion() {
                return 0;
            }

            @Override
            public int getMinorVersion() {
                return 0;
            }

            @Override
            public boolean jdbcCompliant() {
                return false;
            }

            @Override
            public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                return null;
            }
        });
    }
}

