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
        Scanner keyboard = new Scanner (System.in);
        int customerDecision = 1;

        while (customerDecision != 0){
            System.out.println ("\n\nWhat would you like to do with Customer Information? (Enter corresponding number, enter 0 to quit)");
            System.out.println ("1. Add Customer");
            System.out.println ("2. Update Customer Information");
            System.out.println ("3. Delete Customer");
            System.out.println ("4. Search for Customer");
            System.out.println ("5. Show all customers");
            customerDecision = keyboard.nextInt();
            keyboard.nextLine();

            if (customerDecision == 1){//ADD CUSTOMER
                CustomerManager.addCustomer();
            }

            else if (customerDecision == 2){//UPDATE CUSTOMER
                CustomerManager.updateCustomer();
            }

            else if (customerDecision == 3){//DELETE CUSTOMER
                CustomerManager.deleteCustomer();
            }

            else if (customerDecision == 4){//SHOW CUSTOMER
                System.out.println("What is customers License ID number?");
                String licenseID = keyboard.nextLine();
                CustomerManager.searchCustomer(licenseID);
            }

            else if (customerDecision == 5){//SHOW ALL CUSTOMERS
                CustomerManager.displayCustomers();
            }
        }
    }

    static void useRoomInformation(){
        Scanner keyboard = new Scanner(System.in);
        int roomDecision = 1;

        while (roomDecision != 0) {
            System.out.println("\n\nWhat would you like to do with Rooms? (Enter corresponding number, enter 0 to quit)");
            System.out.println("1. Add Room");
            System.out.println("2. Update Room");
            System.out.println("3. Delete Room");
            System.out.println("4. Find Available Room");
            System.out.println("5. Show All Rooms");
            roomDecision = keyboard.nextInt();
            keyboard.nextLine();
            
            if (roomDecision == 1) { // ADD ROOM
                RoomManager.addRoom();
            } 

            else if (roomDecision == 2) { // UPDATE ROOM
                RoomManager.updateRoom();
            } 

            else if (roomDecision == 3) { // DELETE ROOM
                RoomManager.deleteRoom();
            } 

            else if (roomDecision == 4) { // FIND AVAILABLE ROOMS
                RoomManager.searchAvailableRooms();
            }
            
            else if (roomDecision == 5) { //SHOW ALL ROOMS
                RoomManager.showAllRooms();
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
        Scanner keyboard = new Scanner (System.in);
        int invoiceDecision = 1;

        while (invoiceDecision != 0){
            System.out.println ("\n\nWhat would you like to do with Invoice Information? (Enter corresponding number, enter 0 to quit)");
            System.out.println ("1. Create Invoice");
            System.out.println ("2. Update Invoice");
            System.out.println ("3. Delete Invoice");
            System.out.println ("4. Show Invoice");
            invoiceDecision = keyboard.nextInt();
            keyboard.nextLine();

            if (invoiceDecision == 1){//CREATE INVOICE
                InvoiceInformation.createInvoice();
            }

            else if (invoiceDecision == 2){//UPDATE INVOICE
                InvoiceInformation.updateInvoice();
            }

            else if (invoiceDecision == 3){//DELETE INVOICE
                InvoiceInformation.deleteInvoice();
            }

            else if (invoiceDecision == 4){//SHOW INVOICE
                InvoiceInformation.showInvoice();
            }
        }

    }
    static void useReservationInformation(){
        Scanner keyboard = new Scanner (System.in);
        int reservationDecision = 1;

        while (reservationDecision != 0){
            System.out.println ("\n\nWhat would you like to do with Invoice Information? (Enter corresponding number, enter 0 to quit)");
            System.out.println ("1. Create Reservation");
            System.out.println ("2. Update Reservation");
            System.out.println ("3. Delete Reservation");
            System.out.println ("4. Show Reservation");
            reservationDecision = keyboard.nextInt();
            keyboard.nextLine();

            if (reservationDecision == 1){//CREATE RESERVATION
                ReservationManager.addReservation();
            }

            else if (reservationDecision == 2){//UPDATE RESERVATION
                ReservationManager.updateReservation();
            }

            else if (reservationDecision == 3){//DELETE RESERVATION
                ReservationManager.deleteReservation();
            }

            else if (reservationDecision == 4){//SHOW RESERVATION
                System.out.println("What is customers name for reservation?");
                String customerName = keyboard.nextLine();
                ReservationManager.searchReservation(customerName);
            }
        }
    }

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello! Welcome to the Hotel Reservation System!\nWhat would you like to start with? (Enter number that corresponds with your decision, enter 0 to quit)");
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
