package br.com.leandroteixeira.model;

import br.com.leandroteixeira.controller.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    private static Connection connection;

    public static List<Customer> getCustomers() {
        Application.connection = new ConnectionFactory().getConnection();
        String sqlQuery = "SELECT * FROM customers";
        List<Customer> customers = new ArrayList<Customer>();
        ResultSet resultSet;

        try {
            PreparedStatement stmt = connection.prepareStatement(sqlQuery);
            resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Customer newCustomer = new Customer();
                newCustomer.setId(resultSet.getInt("customer_id"));
                newCustomer.setName(resultSet.getString("customer_name"));
                customers.add(newCustomer);
            }

            stmt.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }

        return customers;
    }

    public static List<Movie> getMovies() {
        Application.connection = new ConnectionFactory().getConnection();
        String sqlQuery = "SELECT * FROM movies";
        List<Movie> movies = new ArrayList<Movie>();
        ResultSet resultSet;

        try {
            PreparedStatement stmt = connection.prepareStatement(sqlQuery);
            resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Movie newMovie = new Movie();
                newMovie.setId(resultSet.getInt("movie_id"));
                newMovie.setName(resultSet.getString("movie_name"));
                newMovie.setCategory(resultSet.getString("category"));
                newMovie.setSinopse(resultSet.getString("sinopse"));
                newMovie.setDuration(resultSet.getDouble("duration"));
                newMovie.setReleaseYear(resultSet.getInt("release_year"));
                newMovie.setMainActors(resultSet.getString("main_actors"));
                newMovie.setInStock(resultSet.getInt("in_stock"));
                newMovie.setRented(resultSet.getInt("rented"));
                newMovie.setIsRented(resultSet.getBoolean("is_rented"));
                movies.add(newMovie);
            }

            stmt.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }

        return movies;
    }

    public static void printMovie(Movie movie) {
        System.out.println("Name: " + movie.getName() + "\n" +
                "Category: " + movie.getCategory() + "\n" +
                "Sinopse: " + movie.getSinopse() + "\n" +
                "Duration: " + movie.getDuration() + " Hrs" + "\n" +
                "Release Year: " + movie.getReleaseYear() + "\n" +
                "Main Actors: " + movie.getMainActors() + "\n" +
                "Movies in stock: " + movie.getInStock() + "\n" +
                "Movies rented: " + movie.getRented() + "\n" +
                "Is rented?: " + movie.isRented());
    }
}
