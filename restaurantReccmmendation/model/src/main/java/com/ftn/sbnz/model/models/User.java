package com.ftn.sbnz.model.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.drools.compiler.lang.DRL6Expressions.shiftExpression_return;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String phoneNumber;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private boolean isAdmin;
    @ManyToMany
    private List<Restaurant> favoriteRestaurants;
    @ManyToMany
    private List<Restaurant> recommendedRestaurants;
    //@Column
    //private List<CuisineType> preferredCuisineType;
    @ManyToMany
    private List<Restaurant> highlyRatedRestaurants;

    public User(long id, String firstName, String lastName, String phoneNumber, String email, String password, boolean isAdmin) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.favoriteRestaurants = new ArrayList<>();
        this.recommendedRestaurants = new ArrayList<>();
        //this.preferredCuisineType = new ArrayList<>();
        this.highlyRatedRestaurants = new ArrayList<>();
    }

    public User() {
        this.favoriteRestaurants = new ArrayList<>();
        this.recommendedRestaurants = new ArrayList<>();
        //this.preferredCuisineType = new ArrayList<>();
        this.highlyRatedRestaurants = new ArrayList<>();
    }

    public void addFavoriteRestaurant(Restaurant restaurant) {
        favoriteRestaurants.add(restaurant);
    }

    public void removeFavoriteRestaurant(Restaurant restaurant) {
        favoriteRestaurants.remove(restaurant);
    }
    public void addRecommendedRestaurant(Restaurant restaurant) {
        recommendedRestaurants.add(restaurant);
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public List<Restaurant> getFavoriteRestaurants() {
        return favoriteRestaurants;
    }

    public List<Restaurant> getRecommendedRestaurants() {
        return recommendedRestaurants;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void setFavoriteRestaurants(ArrayList<Restaurant> favoriteRestaurants) {
        this.favoriteRestaurants = favoriteRestaurants;
    }

    public void setRecommendedRestaurants(ArrayList<Restaurant> recommendedRestaurants) {
        this.recommendedRestaurants = recommendedRestaurants;
    }

    /*public List<CuisineType> getPreferredCuisineType() {
        return preferredCuisineType;
    }

    public void setPreferredCuisineType(List<CuisineType> preferredCuisineType) {
        this.preferredCuisineType = preferredCuisineType;
    }

    public void addPreferredCuisineType(CuisineType cuisineType) {
        if (preferredCuisineType == null) {
            preferredCuisineType = new ArrayList<>();
        }
        preferredCuisineType.add(cuisineType);
    }
    */
    public List<Restaurant> getHighlyRatedRestaurants() {
        return highlyRatedRestaurants;
    }

    public void setHighlyRatedRestaurants(List<Restaurant> highlyRatedRestaurants) {
        this.highlyRatedRestaurants = highlyRatedRestaurants;
    }

    public void addHighlyRatedRestaurant(Restaurant restaurant) {
        if (this.highlyRatedRestaurants == null) {
            this.highlyRatedRestaurants = new ArrayList<>();
        }
        this.highlyRatedRestaurants.add(restaurant);
    }

}
