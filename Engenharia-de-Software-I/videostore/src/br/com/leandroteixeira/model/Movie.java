package br.com.leandroteixeira.model;

import java.util.List;

public class Movie {

    private int id;
    private String name;
    private String category;
    private String sinopse;
    private double duration;
    private int releaseYear;
    private String mainActors;
    private int quantity;
    private int inStock;
    private int rented;
    private boolean isRented;

    public Movie (int id, String name, String category, String sinopse, double duration,
                  int releaseYear, String mainActors, int quantity, int inStock, int rented, boolean isRented) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.sinopse = sinopse;
        this. duration = duration;
        this.releaseYear = releaseYear;
        this.mainActors = mainActors;
        this.quantity = quantity;
        this.inStock = inStock;
        this.rented = rented;
        this.isRented = isRented;
    }

    public Movie () {};

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getMainActors() {
        return mainActors;
    }

    public void setMainActors(String mainActors) {
        this.mainActors = mainActors;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
        this.quantity = this.rented + inStock;
    }

    public int getRented() {
        return rented;
    }

    public void setRented(int rented) {
        this.rented = rented;
        this.quantity = this.inStock + rented;
    }

    public boolean getIsRented() {
        return isRented;
    }

    public void setIsRented(boolean rented) {
        isRented = rented;
    }
}
