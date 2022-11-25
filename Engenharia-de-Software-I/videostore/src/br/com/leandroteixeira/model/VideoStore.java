package br.com.leandroteixeira.model;

import br.com.leandroteixeira.controller.Utils;

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
        List <Movie> filteredMovieList = Utils.getMovies();
        for (Movie movie : movies) {
            if (movie.getName() == movieName) {
                filteredMovieList.add(movie);
            }
        }
        return filteredMovieList;
    }

    public Movie findMovieByID(int movieID) {
        List <Movie> filteredMovieList = Utils.getMovies();
        Movie movie = new Movie();
        for (Movie filteredMovie : filteredMovieList) {
            if (filteredMovie.getId() == movieID) {
                movie = filteredMovie;
            }
        }
        return movie;
    }

    public void addNewMovie(Movie newMovie) {
        Utils.addNewMovie(newMovie);
    }

    public void editMovie(int movieId, Movie newMovie) {
        Utils.editMovie(movieId, newMovie);
    }

    public void removeMovie(int movieID) {
        Utils.removeMovie(movieID);
    }
}
