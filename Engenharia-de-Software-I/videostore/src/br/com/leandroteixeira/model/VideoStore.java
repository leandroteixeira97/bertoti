package br.com.leandroteixeira.model;

import java.util.List;

public class VideoStore {

    private List<Movie> movies;
    private List<Customer> customers;

    public VideoStore(List<Movie> movies, List<Customer> customers) {
        this.movies = movies;
        this.customers = customers;
    }

    public List<Movie> getMovies() {
        return this.movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Customer> getClients() {
        return this.customers;
    }

    public void setClients(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Movie> findMoviesByName(String movieName) {
        List <Movie> filteredMovieList = null;
        for (Movie movie : movies) {
            if (movie.getName() == movieName) {
                filteredMovieList.add(movie);
            }
        }
        return filteredMovieList;
    }

    public List<Movie> findMovieByID(int movieID) {
        List <Movie> filteredMovieList = null;
        for (Movie movie : movies) {
            if (movie.getId() == movieID) {
                filteredMovieList.add(movie);
            }
        }
        return filteredMovieList;
    }

    public void editMovie(int movie_id, Movie newMovie) {

    }

    public void removeMovie(int movieID) {

    }
}
