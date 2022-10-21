package br.com.leandroteixeira.model;

import java.util.List;

public class Client {

    private int id;
    private String name;
    private List<RentedMovie> rentedMovies;
    private List<RentedMovie> rentHistory;

    public Client(int id, String name, List<RentedMovie> rentedMovies, List<RentedMovie> rentHistory) {
        this.id = id;
        this.name = name;
        this.rentedMovies = rentedMovies;
        this.rentHistory = rentHistory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RentedMovie> getRentedMovies() {
        return rentedMovies;
    }

    public void setRentedMovies(List<RentedMovie> rentedMovies) {
        this.rentedMovies = rentedMovies;
    }

    public List<RentedMovie> getRentHistory() {
        return rentHistory;
    }

    public void setRentHistory(List<RentedMovie> rentHistory) {
        this.rentHistory = rentHistory;
    }
}
