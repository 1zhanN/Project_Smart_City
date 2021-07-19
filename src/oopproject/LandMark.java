package oopproject;

class LandMark {

    public String name;
    public String address;


    LandMark() {

    }

    LandMark(String name, String address){
        this.name = name;
        this.address = address;

    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "LandMark{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
