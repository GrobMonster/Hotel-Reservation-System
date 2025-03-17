/*
Main Program
Created by Cody Sandford & Wyatt Brusseau
This program will use the other classes in the package to give a central interface for the hotel worker
variables have same name as each classes variables i.e roomNumber for roomInformation is used as roomNumber here
This is not fully done. Still needs to be set up for all the methods and tests
*/
import java.util.Scanner;
import java.util.ArrayList;

public class HotelReservation{
    static void useCustomerInformation(){
        System.out.println("Ran CustomerInformationTest");
    }

    static void useRoomInformation(){
        Scanner keyboard = new Scanner(System.in);
        int roomNumber, numOfBeds;
        boolean isSuite, isRoomAvailable;
        String customersRoom = "N/A";

        System.out.println("\n\nWhat would you like to do with Rooms? (Enter corresponding number, enter 0 to quit)");
        System.out.println("1. Add Room");
        System.out.println("2. Update Room");
        System.out.println("3. Delete Room");
        System.out.println("4. Find Available Room");
        System.out.println("5. Show All Rooms");
        int roomDecision = keyboard.nextInt();
        keyboard.nextLine();

        while (roomDecision != 0) {
            if (roomDecision == 1) { // ADD ROOM
                roomManager.addRoom();
            } 

            else if (roomDecision == 2) { // UPDATE ROOM
                roomManager.updateRoom();
            } 

            else if (roomDecision == 3) { // DELETE ROOM
                roomManager.deleteRoom();
            } 

            else if (roomDecision == 4) { // FIND AVAILABLE ROOMS
                roomManager.searchAvailableRooms();
            }
            
            else if (roomDecision == 5) { //SHOW ALL ROOMS
                ArrayList<RoomInformation> allRooms = roomManager.getListOfRooms();
                if (allRooms.isEmpty()){
                    System.out.println("No Rooms.");
                }
                else{
                    for (RoomInformation room : allRooms){
                        System.out.println(room);                    
                    }
                }
            }

            // Prompt for next action
            System.out.println("\n\nWhat would you like to do next? (Enter number, enter 0 to quit)");
            System.out.println("1. Add Room");
            System.out.println("2. Update Room");
            System.out.println("3. Delete Room");
            System.out.println("4. Find Available Room");
            System.out.println("5. Show All Rooms");
            roomDecision = keyboard.nextInt();
            keyboard.nextLine();
        }
    
    }
    static void useInvoiceInformation(){
        System.out.println("Ran invoiceInformationTest");
    }
    static void useReservationInformation(){
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
                useRoomInformation();
            }
            else if (decision == 2){
                useCustomerInformation();
            }
            else if (decision == 3){
                useInvoiceInformation();
            }
            else if(decision == 4){
                useReservationInformation();
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

//Not sure where to put this
static void useCustomerInformation() {
    Scanner keyboard = new Scanner (System.in);
    int customerDecision = 1;

    while (customerDecision != 0){
    System.out.println ("\n\nWhat would you like to do with Customer Information? (Enter corresponding number, enter 0 to quit)");
    System.out.println ("1. Add Customer");
    System.out.println ("2. Update Customer Information");
    System.out.println ("3. Delete Customer");
    System.out.println ("4. Search for Customer");
    System.out.println ("5. Show all customers");
    int customerDecision = keyboard.nextInt();
    keyboard.nextLine();

    if (customerDecision == 1){
        CustomerManager.addCustomer();
    }

    else if (customerDecision == 2){
        CustomerManager.updateCustomer();
    }

    else if (customerDecision == 3){
        CustomerManager.deleteCustomer();
    }

    else if (customerDecision == 4){
        CustomerManager.searchCustomer();
    }

    else if (customerDecision == 5){
        CustomerManager.displayCustomers();
    }
    }

}
