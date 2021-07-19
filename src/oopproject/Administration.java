package oopproject;

public class Administration {
    
    
    public String name;
    
   
    private String password;
    
    public String[] Hotel = new String[];
    
    public String[] Restaurant = new String[];
    
    public String[] ShoppingMall = new String[];
    
    public String[] Hospital = new String[];
    
    public String[] emergencyNos = new String[];
    
    public String[] Banks = new String[];
    
    public String[] Institutes = new String[];
    
    public Airport airport;
    
    public City city;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    private void setPassword(String password) {
        this.password = password;
    }

    public void[] addHotel(String Hotel)) {
        this.Hotel = Hotel;
    }
    public void[] removeHotel(String Hotel)) {
        this.Hotel = Hotel;
    }
    public String[] getHotel() {
        return Hotel;
    }

    public void[] addRestaurant(String Restaurant)) {
        this.Restaurant = Restaurant;
    }
    public void[] removeRestaurant(String Restaurant)) {
        this.Restaurant = Restaurant;
    }
    public String[] getRestaurant() {
        return Restaurant;
    }

    public void[] addShoppingMall(String ShoppingMall)) {
        this.ShoppingMall = ShoppingMall;
    }
    public void[] removeShoppingMall(String ShoppingMall)) {
        this.ShoppingMall = ShoppingMall;
    }
    public String[] getShoppingMall() {
        return ShoppingMall;
    }

    public void[] addHospital(String Hospital)) {
        this.Hospital = Hospital;
    }
    public void[] removeHospital(String Hospital)) {
        this.Hospital = Hospital;
    }
    public String[] getHospital() {
        return Hospital;
    }
    
    public void[] addemergencyNos(String emergencyNos)) {
        this.emergencyNos = emergencyNos;
    }
    public void[] removeemergencyNos(String emergencyNos)) {
        this.emergencyNos = emergencyNos;
    }
    public String[] getemergencyNos() {
        return emergencyNos;
    }
    
    public void[] addBanks(String Banks)) {
        this.Banks = Banks;
    }
    public void[] removeBanks(String Banks)) {
        this.Banks = Banks;
    }
    public String[] getBanks() {
        return Banks;
    }
    
    public String[] addInstitutes() {
        this.Institutes = Institutes;
    }
    public String[] removeInstitutes() {
        this.Institutes = Institutes;
    }
    public String[] getInstitutes(String Institutes)) {
        return Institutes;
    }
    
    public Airport getAirport() {
        return this.airport;
    }
    
    public Airport setAirport(Airport airport) {
        this.airport = airport;
    }
    
    public toString() {
        
    }
    
}
