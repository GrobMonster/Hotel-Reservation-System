/*
Main Program
Created by Cody Sandford & Wyatt Brusseau
This program will use the other classes in the
package to give a central interface for the 
hotel worker
*/
import java.util.Scanner;

public class HotelReservation{
    void customerInformationTest(){
        System.out.println("Ran CustomerInformationTest")
    }

    void roomInformationTest(){
        int roomNumber;
        int numOfBeds;
        boolean isSuite;
        boolean isRoomAvailable;
        String customersRoom;
        Scanner keyboard = new keyboard.Scanner("System.in");

        System.out.println("Ran roomInformationTest");
    }
    void invoiceInformationTest(){
        System.out.println("Ran invoiceInformationTest")
    }
    void reservationInformationTest(){
        System.out.println("Ran reservationInformationTest")
    }

    public static void main(String[] args){
        Scanner keyboard = new keyboard.Scanner("System.in");

        System.out.println("Hello! Welcome to the Hotel Reservation System!\n What would you like to start with? (Enter number that corresponds with you decision, enter 0 to quit)");
        System.out.println("1.) Rooms");
        System.out.println("2.) Customers"); 
        System.out.println("3.) Invoice");
        System.out.println("4.) Reservation");
        int decision = keyboard.nextInt();

        while (decision != 0){
            if (decision == 1){
                roomInformationTest();
            }
            if (decision == 2){
                customerInformationTest();
            }
            if (decision = 3){
                invoiceInformationTest();
            }
            if(decision = 4){
                reservationInformationTest();
            }
            else{
                System.out.println("Invalid number please enter a number given")
            }
            System.out.println("What would you like to do next? (Enter number that corresponds with you decision, enter 0 to quit)");
            System.out.println("1.) Rooms");
            System.out.println("2.) Customers"); 
            System.out.println("3.) Invoice");
            System.out.println("4.) Reservation
            decision = keyboard.nextInt():
            }
      
}
