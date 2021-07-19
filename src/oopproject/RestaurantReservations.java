package oopproject;

import java.util.*;

public class RestaurantReservations{

    public String name;
    public int noOfPeople;
    public Date date;
    public Restaurant restaurant;
    
    // public int time;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRestaurant() {
        return restaurant.toString();
    }

    // public Restaurant setRestaurant(Restaurant restaurant) {
    //     this.restaurant = restaurant;
    // }

    public int getNoOfPeople() {
        return this.noOfPeople;
    }

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    // public int getTime() {
    //     return this.time;
    // }

    // public Integer setTime(Integer time) {
    //     this.time = time;
    // }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
