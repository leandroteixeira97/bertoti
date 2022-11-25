package br.com.leandroteixeira.controller;

import br.com.leandroteixeira.model.Customer;
import br.com.leandroteixeira.model.Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    private static Connection connection;

    public static List<Customer> getCustomers() {
        Utils.connection = new ConnectionFactory().getConnection();
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
        Utils.connection = new ConnectionFactory().getConnection();
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

    public static void editMovie(int movieId, Movie newMovie) {
        Utils.connection = new ConnectionFactory().getConnection();
        String sqlQuery = "UPDATE movies SET movie_name =" + newMovie.getName() + "," +
                "category=" + newMovie.getCategory() + "," +
                "sinopse=" + newMovie.getSinopse() + "," +
                "duration=" + newMovie.getDuration() + "," +
                "release_year=" + newMovie.getReleaseYear() + "," +
                "main_actors=" + newMovie.getMainActors() + "," +
                "quantity=" + newMovie.getQuantity() + "," +
                "in_stock=" + newMovie.getInStock() + "," +
                "rented=" + newMovie.getRented() + "," +
                "is_rented=" + newMovie.getIsRented() + "," + "WHERE movie_id=" + movieId;
        try {
            PreparedStatement stmt = connection.prepareStatement(sqlQuery);
            stmt.execute();
            stmt.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static void removeMovie(int movieId) {
        Utils.connection = new ConnectionFactory().getConnection();
        String sqlQuery = "DELETE FROM movies WHERE movie_id=" + movieId;
        try {
            PreparedStatement stmt = connection.prepareStatement(sqlQuery);
            stmt.execute();
            stmt.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static void addNewMovie(Movie movie) {
        Utils.connection = new ConnectionFactory().getConnection();
        String sqlQuery = "INSERT INTO movies (movie_name, category, sinopse, duration, release_year, main_actors, quantity, in_stock, rented, is_rented) VALUES (\"" +
                movie.getName() + "\",\"" + movie.getCategory() + "\",\"" + movie.getSinopse() + "\"," + movie.getDuration() + "," + movie.getReleaseYear() + ",\"" + movie.getMainActors() +
                "\"," + movie.getQuantity() + "," + movie.getInStock() + "," + movie.getRented() + "," + movie.getIsRented() + ")";
        try {
            PreparedStatement stmt = connection.prepareStatement(sqlQuery);
            stmt.execute();
            stmt.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
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
                "Is rented?: " + movie.getIsRented());
    }
}
