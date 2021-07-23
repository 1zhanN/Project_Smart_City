package oopproject;


public class Hotel extends LandMark {

    // yet to add composition

    public int price;

    Hotel() {

    }

    public Hotel(String name, String address) {
        super(name, address);
    }

    public Hotel(String name, String address, int price) {
        super(name, address);
        this.price = price;
    }


    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "price=" + price +
                "} " + super.toString();
    }


    // public HotelReservations getHotelReservations() {
    //     return this.hotelReservations;
    // }

    // public HotelReservations setHotelReservations(HotelReservations hotelReservations) {
    //     this.hotelReservations = hotelReservations;
    // }


}
