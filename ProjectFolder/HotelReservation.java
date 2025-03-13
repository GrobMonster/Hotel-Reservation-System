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
        int roomNumber, numOfBeds;
        boolean isSuite, isRoomAvailable;
        String customersRoom;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\n\nWhat would you like to do with Rooms?(Enter corresponding number with your decision, enter 0 to quit)");
        System.out.println("1. Add Room");
        System.out.println("2. Update Room");
        System.out.println("3. Delete Room");
        System.out.println("4. Find Available Room");
        int roomDecision = keyboard.nextInt();
        keyboard.nextLine();
        while (roomDecision != 0){
            if (roomDecision == 1){
                System.out.println("What is the room number that you want to add?");
                roomNumber = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println("How many beds does the room have?");
                numOfBeds = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println("Is this room a suite?(Enter yes / no answer)");
                String answerToQue = keyboard.nextLine();
                if (answerToQue.equalsIgnoreCase("yes")){
                    isSuite = true;
                }
                else{
                    isSuite = false;
                }
                System.out.println("Is the room currently available?(Enter yes / no answer)");
                String answerToQue2 = keyboard.nextLine();
                if (answerToQue2.equalsIgnoreCase("yes")){
                    isRoomAvailable = true;
                }
                else{
                    isRoomAvailable = false;
                }
                System.out.println("Is there a customer booked to this room?(Enter yes / no answer)");
                String answerToQue3 = keyboard.nextLine();
                if (answerToQue3.equalsIgnoreCase("yes")){
                    System.out.println("What is customers first name?");
                    String tempFirstName = keyboard.nextLine();
                    System.out.println("What is customers last name?");
                    String tempLastName = keyboard.nextLine();
                    customer = CustomerInformation(tempfirstName, templastName);
                    customersRoom = customer.getFullName();
                else{
                    customersRoom = "N/A";
                }
                room = new RoomInformation(roomNumber, numOfBeds, isSuite, isRoomAvailable, customersRoom);
                addRoom(room);
            }   
        //END OF DECISION 1
            
            else if (roomDecision == 2){
                System.out.println("What is the room number that you want to update?");
                roomNumber = keyboard.nextInt();
                keyboard.nextLine(); //consume new line
                roomToUpdate = searchRooms(roomNumber);
                if (roomToUpdate != null){
                    System.out.println("What would you like to change about the room? (Enter corresponding number with your decision, enter 0 to quit");
                    System.out.println("1. Room Number");
                    System.out.println("2. Number of Beds");
                    System.out.println("3. Room Availability");
                    System.out.println("4. Customer in room\n");
                    int updateChoice = keyboard.nextInt();
                    keyboard.nextLine(); //consume new line
                    while (updateChoice != 0){
                        if (updateChoice == 1){
                            System.out.println("What is the new room number?");
                            roomNumber = keyboard.nextInt();
                            keyboard.nextLine(); //consume new line
                        }
                        else if (updateChoice == 2){
                            System.out.println("What is the new number of beds?");
                            numOfBeds = keyboard.nextInt();
                            keyboard.nextLine(); //consume new line
                        }
                        else if (updateChoice == 3){
                            System.out.println("Is room available? (Enter yes / no answer)";
                            String isAvailable = keyboard.nextLine();
                            if (isAvailable.equalsIgnoreCase("yes"){
                                isRoomAvailable = true;
                            } 
                            else{
                                isRoomAvaible = false;
                                System.out.println("Is there a customer in this room? (Enter yes / no answer)");
                                isCustomerInRoom = keyboard.nextLine();
                                if (isCustomerInRoom.equalsIgnoreCase("yes"){
                                    System.out.println("What is customers first name?");
                                    String tempFirstName = keyboard.nextLine();
                                    System.out.println("What is customers last name?");
                                    String tempLastName = keyboard.nextLine();
                                    customer = new CustomerInformation(firstName, lastName);
                                    customersRoom = customer.getFullName();
                                }
                            }
                        }
                        System.out.println("Is there more you would like to change? (Enter yes / no answer)");
                        isMoreToUpdate = keyboard.nextLine();
                        if (isMoreToUpdate.equalsIgnoreCase("yes"){
                            System.out.println("What would you like to change about the room? (Enter corresponding number with your decision, enter 0 to quit");
                            System.out.println("1. Room Number");
                            System.out.println("2. Number of Beds");
                            System.out.println("3. Room Availability");
                            System.out.println("4. Customer in room\n");
                            int updateChoice = keyboardnextInt();
                            keyboard.nextLine(); //consume new line
                        }
                        else{
                            break;
                        }
                    }
                    
                else{
                    System.out.println("Room with this room number does not exist.");
                }
                System.out.println("Room was successfully updated")
        //END OF DECISION 2
            else if (roomDecision == 3){
                System.out.println("What room number is the room you want to delete?")
                roomNumber = keyboard.nextInt();
                keyboard.nextLine(); //consume new line
                roomToDelete = searchRooms(roomNumber);
                if (roomToDelete != null){
                    deleteRoom(roomNumber);
                }
                else{
                    System.out.println("Room with this room number does not exist.");
                System.out.println("Room was successfully deleted");
            }
        //END OF DECISION 3
            else if (roomDecision == 4){
                List<RoomInformation> availableRooms = roomManager.searchAvailableRooms();

                if (availableRooms.isEmpty()) {
                System.out.println("No available rooms.");
                } 
                else {
                    System.out.println("\nAvailable Rooms:");
                    for (RoomInformation room : availableRooms) {
                    System.out.println("Room Number: " + room.getRoomNumber() + ", Beds: " + room.getNumOfBeds() + ", Suite: " + (room.isSuite() ? "Yes" : "No") + ", Customer: " + room.getCustomersRoom());
                    }
                }
            }
        //END OF DECISION 4
        System.out.println("\n\nWhat would you like to do with Rooms?(Enter corresponding number with your decision, enter 0 to quit)");
        System.out.println("1. Add Room");
        System.out.println("2. Update Room");
        System.out.println("3. Delete Room");
        System.out.println("4. Find Available Room");
        int roomDecision = keyboard.nextInt();
        keyboard.nextLine();
        //End of While loop    
        }
     keyboard.close();
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
