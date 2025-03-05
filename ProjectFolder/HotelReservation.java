/*
Main Program
Created by Cody Sandford & Wyatt Brusseau
This program will use the other classes in the package to give a central interface for the hotel worker
variables have same name as each classes variables i.e roomNumber for roomInformation is used as roomNumber here
This is not fully done. Still needs to be set up for all the methods and tests
*/
import java.util.Scanner;

public class HotelReservation{
    static void customerInformationTest(){
        System.out.println("Ran CustomerInformationTest");
    }

    static void roomInformationTest(){
        int roomNumber;
        int numOfBeds;
        boolean isSuite;
        boolean isRoomAvailable;
        String customersRoom;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\n\nWhat would you like to do with Rooms?(Enter corresponding number with your decision, enter 0 to quit)");
        System.out.println("1. Add Room");
        System.out.println("2. Update Room");
        System.out.println("3. Delete Room");
        System.out.println("4. Find Available Room");
        int roomdecision = keyboard.nextInt();

        while (roomdecision != 0){
            if (roomdecision == 1)
                System.out.println("What is the Room number that you want to add?");
        }
        
        System.out.println("Ran roomInformationTest");
    }
    static void invoiceInformationTest(){
        System.out.println("Ran invoiceInformationTest");
    }
    static void reservationInformationTest(){
        System.out.println("Ran reservationInformationTest");
    }

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello! Welcome to the Hotel Reservation System!\n What would you like to start with? (Enter number that corresponds with your decision, enter 0 to quit)");
        System.out.println("1. Rooms");
        System.out.println("2. Customers"); 
        System.out.println("3. Invoice");
        System.out.println("4. Reservation");
        int decision = keyboard.nextInt();

        while (decision != 0){
            if (decision == 1){
                roomInformationTest();
            }
            else if (decision == 2){
                customerInformationTest();
            }
            else if (decision == 3){
                invoiceInformationTest();
            }
            else if(decision == 4){
                reservationInformationTest();
            }
            else{
                System.out.println("\nInvalid number please enter a number given\n");
            }
            System.out.println("What would you like to do next? (Enter number that corresponds with your decision, enter 0 to quit)");
            System.out.println("1.) Rooms");
            System.out.println("2.) Customers"); 
            System.out.println("3.) Invoice");
            System.out.println("4.) Reservation");
            decision = keyboard.nextInt();
           }
        keyboard.close();
      
    }
}
