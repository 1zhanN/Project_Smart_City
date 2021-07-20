// welcome to SmartCity

//main method 
package oopproject;

import java.util.Scanner;

public class SmartCity {
    public static void main(String[] args) {

        Administration admin = new Administration();

        System.out.println("""
                What would you like to do: 
                Enter 1 to add data
                Enter 2 to view data
                """);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter: ");
        int number = input.nextInt();

        do {
            switch (number) {
                case 1:
                    do {
                        System.out.println("""
                                                            
                                ----------------------------------------------------
                                            Welcome to HumSafar
                                         
                                            Enter 1 to add Airport
                                            Enter 2 to add a Hospital
                                            Enter 3 to add a Restaurant
                                            Enter 4 to add a Shopping Mall
                                            Enter 5 to add a Bank
                                            Enter 6 to add a Hotel
                                            Enter 7 to add an Institute
                                            Enter 8 to add an Emergency Number
                                            Enter 9 to exit
                                            
                                -----------------------------------------------------
                                """);


                        System.out.print("Enter: ");
                        int choice = input.nextInt();

                        if (choice == 1) {
                            System.out.println("Airport shhhhhhhhhhhhhhhh");
                        } else if (choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7) {
                            System.out.print("Enter name: ");
                            input.nextLine();
                            String name = input.nextLine();
                            System.out.print("Enter address: ");
                            String address = input.nextLine();

                            if (choice == 2) {
                                admin.addHospital(new Hospital(name, address));
                            } else if (choice == 3) {
                                admin.addRestaurant(new Restaurant(name, address));
                            } else if (choice == 4) {
                                admin.addShoppingMall(new ShoppingMalls(name, address));
                            } else if (choice == 5) {
                                admin.addBanks(new Banks(name, address));
                            } else if (choice == 6) {
                                admin.addHotel(new Hotel(name, address));
                            } else {
                                System.out.println("""
                                        What would u like to add: 
                                        Enter 1 to add a school
                                        Enter 2 to add a college
                                        Enter 3 to add a university""");
                                switch (input.nextInt()) {
                                    case 1 -> admin.addInstitutes(new School(name, address));
                                    case 2 -> admin.addInstitutes(new College(name, address));
                                    case 3 -> admin.addInstitutes(new University(name, address));
                                }

                            }
                        } else if (choice == 8) {
                            System.out.print("Enter number: ");
                            input.nextLine();
                            int no = input.nextInt();
                            System.out.print("Enter information regarding information: ");
                            String info = input.nextLine();
                            admin.addemergencyNos(new EmergencyNos(no, info));
                        } else if (choice == 9) {
                            System.exit(0);
                        } else {
                            System.out.println("Wrong number..Enter again");
                        }

                        System.out.println("\nDo you want to continue: ");

                        System.out.print("""
                                Enter 1 to continue 
                                Enter 2 to exit: \t""");
                    } while (input.nextInt() != 2);

                    break;
                case 2:
                    do {
                        System.out.println("""
                                 -----------------------------------------------------
                                              What would you like to see? 
                                              
                                                Enter 1 to view Airport
                                                Enter 2 to view a Hospital
                                                Enter 3 to view a Restaurant
                                                Enter 4 to view a Shopping Mall
                                                Enter 5 to view a Bank
                                                Enter 6 to view a Hotel
                                                Enter 7 to view an Institute
                                                Enter 8 to view an Emergency Number
                                                Enter 9 to view all the information about the city
                                                Enter 10 to exit
                                 -------------------------------------------------------
                                """);

                        System.out.println("Enter: ");
                        int num = input.nextInt();

                        if (num == 1) System.out.println(admin.getAirport());
                        else if (num == 2) System.out.println(admin.getHospital());
                        else if (num == 3) System.out.println(admin.getRestaurant());
                        else if (num == 4) System.out.println(admin.getShoppingMall());
                        else if (num == 5) System.out.println(admin.getBanks());
                        else if (num == 6) System.out.println(admin.getHotel());
                        else if (num == 7) System.out.println(admin.getInstitutes());
                        else if (num == 8) System.out.println(admin.getemergencyNos());
                        else if (num == 9) System.out.println(admin.toString());
                        else if (num == 10) System.exit(0);
                        else System.out.println("Enter a valid number");



                        System.out.println("\nWould you like to continue: ");
                        System.out.println("""
                                Enter 1 to continue 
                                Enter 2 to exit""");
                    } while (input.nextInt() != 2);

                    break;
            }
            System.out.println("""
                                        
                    What would you like to do: 
                    Enter 1 to add data
                    Enter 2 to view data
                    Enter 3 to exit out of the system
                    """);

            number = input.nextInt();

        } while (number != 3);



//
//            case 3:
//                break;
//
//            case 4:
//                break;
//
//            case 5:
//                break;
//
//            case 6:
//                break;
//
//            case 7:
//                break;
//
//            case 8:
//                break;
//            case 9:
//                break;
//
//            default:


//        System.out.println();
//        System.out.println(admin.getRestaurant());
//        System.out.println(admin.toString());

//                Hospital hospital =
//                System.out.println("Type: " + hospital.getClass().getSimpleName() + " " + hospital.toString());
//        Administration admin = new Administration();

//        City city = new City("Karachi", "Pakistan");
//
//
//        EmergencyNos em = new EmergencyNos(119, "Police");
//        EmergencyNos em1 = new EmergencyNos(1122, "Fire emergency");
//
//        System.out.println();
//
//
//        System.out.println(em.toString());
//        System.out.println(em1.toString());
//        admin.addemergencyNos(em);
//        admin.addemergencyNos(em1);

//        System.out.println(admin.getemergencyNos());
//
//        System.out.println();
//
//
//        Banks bank = new Banks("Habib Bank", "Sath wali gali");
//        admin.addBanks(bank);
//        System.out.println(admin.getBanks());
//
//        System.out.println();
//
//        ShoppingMalls sp = new ShoppingMalls("LuckyOne", "Rashid minhas");
//        admin.addShoppingMall(sp);
//        System.out.println(admin.getShoppingMall());
//
//        System.out.println();
//
//
//        Institute school = new School("Beacon House", "Gulshan");
//        admin.addInstitutes(school);
//
//        Institute college = new College("PECHS", "DHA");
//        admin.addInstitutes(college);
//        System.out.println(admin.getInstitutes());
//
//
//        Hotel ht = new Hotel("Grace", "DHA", 1500);
//        admin.addHotel(ht);
//        System.out.println(admin.getHotel());
//        admin.toString();
//
//
//        System.out.println();
//        System.out.println();
//
//        System.out.println(admin.toString());
//
//
//
//
//
//
//


    }
}
