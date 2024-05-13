package com.ftn.sbnz.model.models;

public class Review {

    private long id;
    private User user;
    private Restaurant restaurant;
    private double rating;

    public Review(long id, User user, Restaurant restaurant, int rating) {
        this.id = id;
        this.user = user;
        this.restaurant = restaurant;
        this.rating = rating;
    }

    public Review(double rating) {
        this.rating = rating;
    }

    // Getters
    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public double getRating() {
        return rating;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
