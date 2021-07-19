// welcome to SmartCity

//main method 
package oopproject;


public class SmartCity{
    public static void main(String[] args) {

        Administration admin = new Administration();

        City city = new City("Karachi", "Pakistan");
        

        EmergencyNos em = new EmergencyNos(119, "Police");        
        EmergencyNos em1 = new EmergencyNos(1122, "Fire emergency");

        System.out.println();


        System.out.println(em.toString());
        System.out.println(em1.toString());
        admin.addemergencyNos(em);
        admin.addemergencyNos(em1);

        System.out.println(admin.getemergencyNos());

        System.out.println();


        Banks bank = new Banks("Habib Bank", "Sath wali gali");
        admin.addBanks(bank);
        System.out.println(admin.getBanks());

        System.out.println();

        ShoppingMalls sp = new ShoppingMalls("LuckyOne", "Rashid minhas");
        admin.addShoppingMall(sp);
        System.out.println(admin.getShoppingMall());

        System.out.println();


        Institute school = new School("Beacon House", "Gulshan");
        admin.addInstitutes(school);

        Institute college = new College("PECHS", "DHA");
        admin.addInstitutes(college);
        System.out.println(admin.getInstitutes());


        Hotel ht = new Hotel("Grace", "DHA", 1500);
        admin.addHotel(ht);
        System.out.println(admin.getHotel());
        admin.toString();


        System.out.println();
        System.out.println();

        System.out.println(admin.toString());









        
    }
}
 