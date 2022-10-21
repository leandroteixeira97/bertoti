package br.com.leandroteixeira.model;

import java.util.List;

public class Movie {

    private int id;
    private String name;
    private String category;
    private String sinopse;
    private double duration;
    private int releaseYear;
    private List<String> mainActors;
//    private int quantity;
//    private int inStock;
//    private int rented;
    private boolean isRented;

    public Movie (int id, String name, String category, String sinopse, double duration,
                  int releaseYear, List<String> mainActors, boolean isRented) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.sinopse = sinopse;
        this. duration = duration;
        this.releaseYear = releaseYear;
        this.mainActors = mainActors;
        this.isRented = isRented;
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

    public List<String> getMainActors() {
        return mainActors;
    }

    public void setMainActors(List<String> mainActors) {
        this.mainActors = mainActors;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}
