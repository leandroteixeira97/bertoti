package br.com.leandroteixeira.view;

import br.com.leandroteixeira.controller.ConnectionFactory;
import br.com.leandroteixeira.model.VideoStore;

public class Main {

    public static void main(String[] args) {

        VideoStore videoStore = new VideoStore(ConnectionFactory.Application.getMovies(), ConnectionFactory.Application.getCustomers());

    }

}
