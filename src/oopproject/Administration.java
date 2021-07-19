package oopproject;

import java.util.ArrayList;

public class Administration {

    public String name;
    private String password;

    public ArrayList<Hotel> hotel = new ArrayList<>();
    public ArrayList<Restaurant> restaurant = new ArrayList<>();
    public ArrayList<ShoppingMalls> shoppingMalls = new ArrayList<>();
    public ArrayList<Hospital> hospitals = new ArrayList<>();
    public ArrayList<EmergencyNos> emergencyNos = new ArrayList<>();
    public ArrayList<Banks> banks = new ArrayList<>();
    public ArrayList<Institute> institutes = new ArrayList<>();
    public Airport airport;
    public City city;

    Administration() {

    }

    public void setName(String name) {
        this.name = name;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public void addHotel(Hotel hotel) {
        this.hotel.add(hotel);
    }

    public void removeHotel(Hotel hotel) {
        this.hotel.remove(hotel);
    }

    public String getHotel() {
        return hotel.toString();
    }

    public void addRestaurant(Restaurant restaurant) {
        this.restaurant.add(restaurant);

    }

    public void removeRestaurant(Restaurant restaurant) {
        this.restaurant.remove(restaurant);
    }

    public String getRestaurant() {
        return restaurant.toString();
    }

    public void addShoppingMall(ShoppingMalls shoppingMalls) {
        this.shoppingMalls.add(shoppingMalls);
    }

    public void removeShoppingMall(ShoppingMalls shoppingMalls) {
        this.shoppingMalls.remove(shoppingMalls);
    }

    public String getShoppingMall() {
        return shoppingMalls.toString();
    }

    public void addHospital(Hospital hospitals) {
        this.hospitals.add(hospitals);
    }

    public void removeHospital(Hospital hospitals) {
        this.hospitals.remove(hospitals);
    }

    public String getHospital() {
        return hospitals.toString();
    }

    public void addemergencyNos(EmergencyNos emergencyNos) {
        this.emergencyNos.add(emergencyNos);
    }

    public void removeemergencyNos(EmergencyNos emergencyNos) {
        this.emergencyNos.remove(emergencyNos);
    }

    public String getemergencyNos() {
        return emergencyNos.toString();
    }

    public void addBanks(Banks banks) {
        this.banks.add(banks);
    }

    public void removeBanks(Banks banks) {
        this.banks.remove(banks);
    }

    public String getBanks() {
        return banks.toString();
    }

    public void addInstitutes(Institute institutes) {
        this.institutes.add(institutes);
    }

    public void removeInstitutes(Institute institutes) {
        this.institutes.remove(institutes);
    }

    public String getInstitutes() {
        return institutes.toString();
    }

    public String getAirport() {
        return airport.toString();
    }

    // public void setAirport(Airport airport) {
    // this.airport = airport;
    // }

    @Override
    public String toString() {
        return "Administration{" + ", hotel=" + hotel + ", restaurant=" + restaurant + ", shoppingMalls="
                + shoppingMalls + ", hospitals=" + hospitals + ", emergencyNos=" + emergencyNos + ", banks=" + banks
                + ", institutes=" + institutes + ", airport=" + airport + ", city=" + city + '}';
    }

}
