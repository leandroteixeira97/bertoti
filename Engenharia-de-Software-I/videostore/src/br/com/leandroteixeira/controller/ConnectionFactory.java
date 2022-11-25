package br.com.leandroteixeira.controller;

import br.com.leandroteixeira.model.Customer;
import br.com.leandroteixeira.model.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectionFactory {

    public Connection getConnection() {

        try {

            return DriverManager.getConnection("jdbc:mysql://localhost/videostore", "root", "Leandr@1997");

        } catch (SQLException exception) {

            throw new RuntimeException(exception);

        }

    }
}
