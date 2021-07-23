package oopproject;



public class City {

    private String name;
    private String country;
    // private Administration;

    City(String name, String country) {
        this.name = name;
        this.country = country;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

// public Administration getinvalid() {
    //     return this.Administration;
    // }

    // public Administration setinvalid(Administration ) {
    //     this.Administration = Administration ;
    // }

}
