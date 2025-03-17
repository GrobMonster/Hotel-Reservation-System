/* 
Hotel Reservation System
Created by: Cody Sandford & Wyatt Brusseau

This code is not fully done. Still need a delete room method and figure out if we want a file that holds all rooms so it doesn't get lost after everytime we run program.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class RoomManager {
    private ArrayList<RoomInformation> listOfRooms;
    private Scanner keyboard = new Scanner(System.in);
    private int tempRoomNumber, tempNumOfBeds;
    private boolean tempIsSuite, tempIsRoomAvailable;
    private String tempCustomersRoom = "N/A";

    RoomManager() {
        this.listOfRooms = new ArrayList<>();
    }

    ArrayList<RoomInformation> getListOfRooms() {
        return this.listOfRooms;
    }

    void addRoom() {
        System.out.println("Enter room number:");
        tempRoomNumber = keyboard.nextInt();

        if (searchRooms(tempRoomNumber) == null) { // Fix: Correct condition
            keyboard.nextLine();
            System.out.println("Enter number of beds:");
            tempNumOfBeds = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Is this room a suite? (yes/no)");
            tempIsSuite = keyboard.nextLine().equalsIgnoreCase("yes");
            System.out.println("Is the room available? (yes/no)");
            tempIsRoomAvailable = keyboard.nextLine().equalsIgnoreCase("yes");

            if (!tempIsRoomAvailable) {
                System.out.println("Is there a customer booked to this room? (yes/no)");
                if (keyboard.nextLine().equalsIgnoreCase("yes")) {
                    System.out.println("Enter customer's first name:");
                    String firstName = keyboard.nextLine();
                    System.out.println("Enter customer's last name:");
                    String lastName = keyboard.nextLine();
                    CustomerInformation customer = new CustomerInformation(firstName, lastName);
                    tempCustomersRoom = customer.getFullName();
                }
            }

            RoomInformation addedRoom = new RoomInformation(tempRoomNumber, tempNumOfBeds, tempIsSuite, tempIsRoomAvailable, tempCustomersRoom);
            listOfRooms.add(addedRoom);
            System.out.println("Room successfully added.");
        } else {
            System.out.println("Room already exists.");
        }
    }

    void deleteRoom() {
        System.out.println("Enter the room number to delete:");
        tempRoomNumber = keyboard.nextInt();
        keyboard.nextLine();
        RoomInformation deletedRoom = searchRooms(tempRoomNumber);

        if (deletedRoom != null) { // Fix: Corrected variable name
            listOfRooms.remove(deletedRoom);
            System.out.println("Room successfully deleted.");
        } else {
            System.out.println("Room not found.");
        }
    }

    void updateRoom() {
        System.out.println("Enter the room number to update:");
        tempRoomNumber = keyboard.nextInt();
        keyboard.nextLine();
        RoomInformation roomToUpdate = searchRooms(tempRoomNumber);

        if (roomToUpdate != null) {
            System.out.println("Choose what to update (0 to quit):");
            System.out.println("1. Room Number");
            System.out.println("2. Number of Beds");
            System.out.println("3. Room Availability");

            int updateChoice = keyboard.nextInt();
            keyboard.nextLine();

            while (updateChoice == 1 || updateChoice == 2 || updateChoice == 3) { // Fix: Corrected variable name
                if (updateChoice == 1) {
                    System.out.println("Enter new room number:");
                    tempRoomNumber = keyboard.nextInt();
                    keyboard.nextLine();
                    roomToUpdate.setRoomNumber(tempRoomNumber);
                } 
                else if (updateChoice == 2) {
                    System.out.println("Enter new number of beds:");
                    tempNumOfBeds = keyboard.nextInt();
                    keyboard.nextLine();
                    roomToUpdate.setNumOfBeds(tempNumOfBeds);
                } 
                else if (updateChoice == 3) {
                    System.out.println("Is room available? (yes/no)");
                    tempIsRoomAvailable = keyboard.nextLine().equalsIgnoreCase("yes");
                    roomToUpdate.setIsRoomAvailable(tempIsRoomAvailable);

                    if (!tempIsRoomAvailable) {
                        System.out.println("Is there a customer in this room? (yes/no)");
                        if (keyboard.nextLine().equalsIgnoreCase("yes")) {
                            System.out.println("Enter customer's first name:");
                            String firstName = keyboard.nextLine();
                            System.out.println("Enter customer's last name:");
                            String lastName = keyboard.nextLine();
                            CustomerInformation customer = new CustomerInformation(firstName, lastName);
                            roomToUpdate.setCustomersRoom(customer);
                        }
                    }
                    else{
                            CustomerInformation customer = new CustomerInformation();
                            roomToUpdate.setCustomersRoom(customer);
                    }
                    
                }

                System.out.println("Would you like to make more changes? (yes/no)");
                if (!keyboard.nextLine().equalsIgnoreCase("yes")) {
                    break;
                }
                System.out.println("Choose what to update (0 to quit):");
                System.out.println("1. Room Number");
                System.out.println("2. Number of Beds");
                System.out.println("3. Room Availability");
                updateChoice = keyboard.nextInt();
                keyboard.nextLine();
            }
            System.out.println("Room successfully updated.");
        } else {
            System.out.println("Room not found.");
        }
    }

    // Method to check for all available rooms
    ArrayList<RoomInformation> searchAvailableRooms() {
        ArrayList<RoomInformation> availableRooms = new ArrayList<>();
        for (RoomInformation room : listOfRooms) {
            if (room.getIsRoomAvailable()) {
                availableRooms.add(room);
            }
        }

        if (availableRooms.isEmpty()) {
            System.out.println("No available rooms.");
        } else {
            System.out.println("\nAvailable Rooms:");
            for (RoomInformation room : availableRooms) {
                System.out.print("Room Number: " + room.getRoomNumber() + "\n Beds: " + room.getNumOfBeds());
                if (room.getIsSuite()) {
                    System.out.println("\nSuite: Yes");
                    if (room.getIsRoomAvailable()){
                        System.out.println("Available: Yes" + "\nCustomer's Name in Room: " + room.getCustomersRoom());
                    }
                    else{
                        System.out.println("Available: No" + "\nCustomer's Name in Room: " + room.getCustomersRoom());
                    }
                } 
                else {
                    System.out.println("\nSuite: No" + "\nCustomer's Name in Room: " + room.getCustomersRoom());
                    if (room.getIsRoomAvailable()){
                        System.out.println("Available: Yes" + "\nCustomer's Name in Room: " + room.getCustomersRoom());
                    }
                    else{
                        System.out.println("Available: No" + "\nCustomer's Name in Room: " + room.getCustomersRoom());
                    }
                }
            }
        }
        return availableRooms;
    }

    // Searches for a specific room number
    RoomInformation searchRooms(int roomNumber) {
        for (RoomInformation room : listOfRooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}
