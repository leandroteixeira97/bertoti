package br.com.leandroteixeira.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {

        try {

            return DriverManager.getConnection("jdbc:mysql://localhost/videostore", "root", "Leandr@1997");

        } catch (SQLException exception) {

            throw new RuntimeException(exception);

        }

    }

}
