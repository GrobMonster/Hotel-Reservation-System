/*
Main Program
Created by Cody Sandford & Wyatt Brusseau
This program will use the other classes in the package to give a central interface for the hotel worker
variables have same name as each classes variables i.e roomNumber for roomInformation is used as roomNumber here
This is not fully done. Still needs to be set up for all the methods and tests
*/
import java.util.Scanner;

public class HotelReservation{
    static void useCustomerInformation(){
        System.out.println("Ran CustomerInformationTest");
    }

    static void useRoomInformation(){
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
            if (roomdecision == 1){
                System.out.println("What is the room number that you want to add?");
                roomNumber = keyboard.nextInt();
                System.out.println("How many beds does the room have?");
                numOfBeds = keyboard.nextInt();
                System.out.println("Is this room a suite?(give yes / no answer)");
                String answerToQue = keyboard.nextLine();
                if (answerToQue.equalsIgnoreCase("yes")){
                    isSuite = true;
                }
                else{
                    isSuite = false;
                }
                System.out.println("Is the room currently available?(give yes / no answer)");
                String answerToQue2 = keyboard.nextLine();
                if (answerToQue2.equalsIgnoreCase("yes")){
                    isRoomAvailable = true;
                }
                else{
                    isRoomAvailable = false;
                }
                System.out.println("Is there a customer booked to this room?(give yes / no answer)");
                String answerToQue3 = keyboard.nextLine();
                if (answerToQue3.equalsIgnoreCase("yes"){
                    System.out.println("What is customers first name?");
                    String tempFirstName = keyboard.nextLine();
                    System.out.println("What is customers last name?");
                    String tempLastName = keyboard.nextLine();
                    customer = CustomerInformation(firstName, lastName);
                    customersRoom = customer.getFullName();
                else{
                    customersRoom = "N/A";
                }
                room = RoomInformation(roomNumber, numOfBeds, isSuite, isRoomAvailable, customersRoom);
                addRoom(room);
            }    
            if (roomdecision == 2){
                System.out.println("What is the room number that you want to update?");
                roomNumber = keyboard.nextInt();
                

            }
        //End of While loop    
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
                useInvoiceInformationTest();
            }
            else if(decision == 4){
                useReservationInformationTest();
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
