package br.com.leandroteixeira.view;

import br.com.leandroteixeira.controller.ConnectionFactory;
import br.com.leandroteixeira.controller.Utils;
import br.com.leandroteixeira.model.Movie;
import br.com.leandroteixeira.model.VideoStore;

public class Main {

    public static void main(String[] args) {

        VideoStore videoStore = new VideoStore(Utils.getMovies(), Utils.getCustomers());
        for (Movie movie: videoStore.getMovies()) {
            Utils.printMovie(movie);
            System.out.println("\n");
        }

        // Movie newMovie = new Movie(0, "Filme de teste", "Categoria de teste", "Sinopse de teste", 2.0, 2022, "Ator de teste 1, Ator de teste 2", 10, 5, 5, true);

        // videoStore.addNewMovie(newMovie);

        // VideoStore videoStore2 = new VideoStore(Utils.getMovies(), Utils.getCustomers());

        /*
        for (Movie movie: videoStore2.getMovies()) {
            Utils.printMovie(movie);
            System.out.println("\n");
        } */

        videoStore.removeMovie(8);

    }

}
