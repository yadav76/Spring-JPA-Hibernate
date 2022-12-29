package com.example.Springjpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity   // Create Movie as Table in Database
public class Movie {

    @Id
    @Column(name="movie_name")
    private String name;
    private int duration;
    private double rating;

    public Movie() {

    }

    public Movie(String name, int duration, double rating) {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public double getRating() {
        return rating;
    }
}
