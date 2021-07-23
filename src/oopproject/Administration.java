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
    public ArrayList<Airport> airport = new ArrayList<>();
    //    public Airport airport;
    public City city;

    Hospital hos = new Hospital();

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

    public void removeHotel(int j) {
        this.hotel.remove(j);
    }

    public String getHotel() {

        String finalresult = "LandMark type: Hotel\n";
        int number = 1;


        if (hotel.isEmpty()) {
            return "There are no hotels available at the time";

        } else {
            for (Hotel value : hotel) {
                finalresult += "Hotel " + number + " " + " Name: " + value.name
                         + " " + " Address: " + value.address;
                finalresult += "\n";
                number++;
            }
        }
        return finalresult;
    }

//        return null;
//        return hotel.toString();


    public void addRestaurant(Restaurant restaurant) {
        this.restaurant.add(restaurant);

    }

    public void removeRestaurant(int j) {
        this.restaurant.remove(j);
    }

    public String getRestaurant() {
        String finalresult = "LandMark type: Restaurant\n";
        int number = 1;


        if (restaurant.isEmpty()) {
            return "There are no restaurants available at the time";

        } else {
            for (Restaurant value : restaurant) {
                finalresult += "Restaurant " + number + "\nName: " + value.name + "\n"
                        + "Address: " + value.address;
                finalresult += "\n\n";
                number++;
            }
        }
        return finalresult;
    }

//        return restaurant.toString();

    public void addShoppingMall(ShoppingMalls shoppingMalls) {
        this.shoppingMalls.add(shoppingMalls);
    }

    public void removeShoppingMall(int j) {
        this.shoppingMalls.remove(j);
    }

    public String getShoppingMall() {
        String finalresult = "LandMark type: Shopping Mall\n";
        int number = 1;


        if (shoppingMalls.isEmpty()) {
            return "There are no shopping malls available at the time";

        } else {
            for (ShoppingMalls value : shoppingMalls) {
                finalresult += "Shopping Mall " + number + "\nName: " + value.name + "\n"
                        + "Address: " + value.address;
                finalresult += "\n\n";
                number++;
            }
        }
        return finalresult;
    }

    public void addHospital(Hospital hospitals) {
        this.hospitals.add(hospitals);
    }

    public void removeHospital(int j) {
                this.hospitals.remove(j);
    }

    public String getHospital() {
        String finalresult = "LandMark type: Hospital\n";
        int number = 1;


        if (hospitals.isEmpty()) {
            return "There are no hospitals available at the time";

        } else {
            for (Hospital value : hospitals) {
                finalresult += "Hospital " + number + "\nName: " + value.name + "\n"
                        + "Address: " + value.address;
                finalresult += "\n\n";
                number++;
            }
        }
        return finalresult;
    }

    public void addemergencyNos(EmergencyNos emergencyNos) {
        this.emergencyNos.add(emergencyNos);
    }

    public void removeemergencyNos(EmergencyNos emergencyNos) {
        this.emergencyNos.remove(emergencyNos);
    }

    public String getemergencyNos() {
        String finalresult = "Type: Emergency Numbers\n";
        int number = 1;


        if (emergencyNos.isEmpty()) {
            return "There are no numbers available at the time";

        } else {
            for (EmergencyNos value : emergencyNos) {
                finalresult += "Emergency number " + number + "\nNumber: " + value.number + "\n"
                        + "Information: " + value.information;
                finalresult += "\n\n";
                number++;
            }
        }
        return finalresult;
    }

    public void addBanks(Banks banks) {
        this.banks.add(banks);
    }

    public void removeBanks(int j) {
        this.banks.remove(j);
    }

    public String getBanks() {
        String finalresult = "LandMark Type: Banks\n";
        int number = 1;


        if (banks.isEmpty()) {
            return "There are no banks available at the time";

        } else {
            for (Banks value : banks) {
                finalresult += "Hospital " + number + "\nName: " + value.name + "\n"
                        + "Address: " + value.address;
                finalresult += "\n\n";
                number++;
            }
        }
        return finalresult;
    }

    public void addInstitutes(Institute institutes) {
        this.institutes.add(institutes);
    }

    public void removeInstitutes(Institute institutes) {
        this.institutes.remove(institutes);
    }

    public String getInstitutes() {
        String finalresult = "LandMark Type: Instits\n";
        int number = 1;


        if (institutes.isEmpty()) {
            return "There are no banks available at the time";

        } else {
            for (Banks value : banks) {
                finalresult += "Hospital " + number + "\nName: " + value.name + "\n"
                        + "Address: " + value.address;
                finalresult += "\n\n";
                number++;
            }
        }
        return finalresult;
    }


    public void addAirport(Airport airport) {
        this.airport.add(airport);
    }

    public void removeAirport(Airport airport) {
        this.airport.remove(airport);
    }

    public String getAirport() {
        return airport.toString();
    }

//    public String getAirport() {
//        return airport.toString();
//    }

    // public void setAirport(Airport airport) {
    // this.airport = airport;
    // }

    @Override
    public String toString() {
        return "Administration{" + "\nhotel=" + hotel + "\nrestaurant=" + restaurant + "\nshoppingMalls="
                + shoppingMalls + "\nhospitals=" + hospitals + "\nemergencyNos=" + emergencyNos + "\nbanks=" + banks
                + "\ninstitutes=" + institutes + "\nairport=" + airport + "\ncity=" + city + '}';
    }

}

