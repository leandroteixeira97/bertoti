package br.com.leandroteixeira.model;

public class RentedMovie {

    private Movie movie;
    private int rentPeriod;
    private double rentValue;

    public RentedMovie(Movie movie, int rentPeriod, double rentValue) {
        this.movie = movie;
        this.rentPeriod = rentPeriod;
        this.rentValue = rentValue;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getRentPeriod() {
        return rentPeriod;
    }

    public void setRentPeriod(int rentPeriod) {
        this.rentPeriod = rentPeriod;
    }

    public double getRentValue() {
        return rentValue;
    }

    public void setRentValue(double rentValue) {
        this.rentValue = rentValue;
    }
}
