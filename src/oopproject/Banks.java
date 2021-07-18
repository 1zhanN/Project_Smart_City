package Banks;

public class Banks extends LandMark {
   
    public String[] Banks = new String[];

    public double dollarRate;
    
    public Administration administration;
    
    public Banks(String name, String address, double dollarRate){
        super(name, address);
        this.dollarRate = dollarRate;
    }
    
    public String setDollarRate(){
        this.dollarRate = dollarRate;
    }
    public double getDollarRate(){
        return dollarRate;
    }
    
    public toString() {
        
    }
    
}
