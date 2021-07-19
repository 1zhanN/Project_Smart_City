package oopproject;

public class Hotel extends LandMark {
    
    public int price;
    
    public String[] Hotels = new String[];
    
    public Administration administration;
    
    public HotelReservations hotelReservations;
    
    public Hotel(String name, String address, int price){
        super(name,address);
        this.price = price;
    }
    
    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public HotelReservations getHotelReservations() {
        return this.hotelReservations;
    }
    
    public HotelReservations setHotelReservations(HotelReservations hotelReservations) {
        this.hotelReservations = hotelReservations;
    }
    
    public toString() {
        
    }
    
}
