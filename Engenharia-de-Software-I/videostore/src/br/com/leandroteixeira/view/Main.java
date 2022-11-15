package br.com.leandroteixeira.view;

import br.com.leandroteixeira.model.Application;
import br.com.leandroteixeira.model.Customer;
import br.com.leandroteixeira.model.Movie;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Movie> movies = Application.getMovies();
        List<Customer> customers = Application.getCustomers();

        for (Movie movie: movies) {
            Application.printMovie(movie);
            System.out.printf("\n");
        }

    }

}
