package org.controllers;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:~//new14/egzaminas";
    private java.sql.Connection con=getConnection();
    final String USER = "";
    final String PASS = "";


    public Connection() throws ClassNotFoundException {
    }

    public java.sql.Connection getConnection() throws ClassNotFoundException {
        try {
            Class.forName(JDBC_DRIVER);
            if (con != null) {
                System.out.println("Successfully connected to MySQL database test");
            }
            System.out.println("adding test data...\n");
            return con = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Connection failed " + e.getMessage());
        }
        return null;
    }
}
