package oopproject;

public class EmergencyNos {

    public int number;
    public String information;


    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getInformation() {
        return this.information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

     @Override
     public String toString() {
         return "EmergencyNos{" +
                 "number=" + number +
                 ", information='" + information + '\'' +
                 '}';
     }
 }

