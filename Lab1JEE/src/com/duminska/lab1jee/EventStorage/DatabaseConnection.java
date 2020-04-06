package com.duminska.lab1jee.EventStorage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Class that returns the connection to the postgresql database
 */
public class DatabaseConnection {

    /**
     * @param user     postgresql user
     * @param password postgresql user's password
     * @return connection or null if it couldn't create one
     */
    public static Connection createConnection(String database, String user, String password) {
        Connection conn;

        Properties props = new Properties();
        props.setProperty("user", user);
        props.setProperty("password", password);

        try {
            String url = "jdbc:postgresql://localhost/" + database;
            conn = DriverManager.getConnection(url, props);
        } catch (Exception e) {
            return null;
        }
        return conn;
    }
}
