package oopproject;

import java.util.Date;

public class HotelReservations {


    public String name;
    public String nameOfHotel;
    public int noOfRooms;
    public int totalPeople;
    public double total;
    public Date date;
    public Hotel hotel;


    HotelReservations(String name, String nameOfHotel, int noOfRooms, int totalPeople) {

        this.name = name;
        this.nameOfHotel = nameOfHotel;
        this.noOfRooms = noOfRooms;
        this.totalPeople = totalPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfHotel() {
        return nameOfHotel;
    }

    public void setNameOfHotel(String nameOfHotel) {
        this.nameOfHotel = nameOfHotel;
    }

    public Integer getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(Integer noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public int getTotalPeople() {
        return totalPeople;
    }

    public void setTotalPeople(Integer totalPeople) {
        this.totalPeople = totalPeople;
    }

    public String getHotel() {
        return hotel.toString();
    }

    // public Hotel setHotel(Hotel hotel) {
    //     this.hotel = hotel;
    // }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
