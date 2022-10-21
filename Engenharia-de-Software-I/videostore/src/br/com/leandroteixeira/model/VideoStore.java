package br.com.leandroteixeira.model;

import java.util.List;

public class VideoStore {

    private List<Movie> movies;
    private List<Client> clients;

    public VideoStore(List<Movie> movies, List<Client> clients) {
        this.movies = movies;
        this.clients = clients;
    }

    public List<Movie> getMovies() {
        return this.movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Client> getClients() {
        return this.clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
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
