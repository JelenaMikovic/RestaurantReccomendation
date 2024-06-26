package com.ftn.sbnz.model.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private CuisineType cuisineType;
    @Column
    private String location;
    @Column
    private double price;
    @Column
    private String openingHour;
    @Column
    private String closingHour;
    @Column
    private Boolean isVegetarianFriendly;
    @Column
    private Boolean isSmokerFriendly;
    @OneToMany
    private List<Review> reviews;
    @Column
    private boolean isTrending;

    public Restaurant(){
        this.reviews = new ArrayList<>();
        this.isTrending = false;
    }

    public Restaurant(long id, CuisineType cuisineType, String location, double price, String openingHour, String closingHour, Boolean isVegetarianFriendly, Boolean isSmokerFriendly) {
        this.id = id;
        this.cuisineType = cuisineType;
        this.location = location;
        this.price = price;
        this.openingHour = openingHour;
        this.closingHour = closingHour;
        this.reviews = new ArrayList<>();
        this.isSmokerFriendly = isSmokerFriendly;
        this.isVegetarianFriendly = isVegetarianFriendly;
        this.isTrending = false;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public String getOpeningHour() {
        return openingHour;
    }

    public String getClosingHour() {
        return closingHour;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public Boolean getIsSmokerFriendly() {
        return isSmokerFriendly;
    }

    public Boolean getIsVegetarianFriendly() {
        return isVegetarianFriendly;
    }

    public Boolean getIsTrendning() {
        return isTrending;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOpeningHour(String openingHour) {
        this.openingHour = openingHour;
    }

    public void setClosingHour(String closingHour) {
        this.closingHour = closingHour;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void setSmokerFriendly(Boolean isSmokerFriendly) {
        this.isSmokerFriendly = isSmokerFriendly;
    }

    public void setVegetarianFriendly(Boolean isVegetarianFriendly) {
        this.isVegetarianFriendly = isVegetarianFriendly;
    }

    public void setTrendning(Boolean isTrending) {
        this.isTrending = isTrending;
    }
}
