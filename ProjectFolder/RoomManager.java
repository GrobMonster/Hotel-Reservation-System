/* 
Hotel Reservation System
Room Manager
Work with the rooms to add, update, delete, and show available rooms and all rooms
Created by: Cody Sandford & Wyatt Brusseau
This code is done
*/
import java.util.ArrayList;
import java.util.Scanner;

public class RoomManager {
    private static ArrayList<RoomInformation> listOfRooms;
    private static Scanner keyboard = new Scanner(System.in);

    RoomManager() {
        this.listOfRooms = new ArrayList<>();
    }

    ArrayList<RoomInformation> getListOfRooms() {
        return this.listOfRooms;
    }

    //Method to add room
    public static void addRoom() {
        String tempCustomersRoom = "N/A";
        System.out.println("Enter room number:");
        int tempRoomNumber = keyboard.nextInt();

        if (searchRooms(tempRoomNumber) == null) {
            keyboard.nextLine();
            System.out.println("Enter number of beds:");
            int tempNumOfBeds = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Is this room a suite? (Enter y or n)");
            boolean tempIsSuite = keyboard.nextLine().equalsIgnoreCase("y");
            System.out.println("Is the room available? (Enter y or n)");
            boolean tempIsRoomAvailable = keyboard.nextLine().equalsIgnoreCase("y");

            if (!tempIsRoomAvailable) {
                System.out.println("Is there a customer booked to this room? (Enter y or n)");
                if (keyboard.nextLine().equalsIgnoreCase("y")) {
                    System.out.println("Enter customer's first name:");
                    String firstName = keyboard.nextLine();
                    System.out.println("Enter customer's last name:");
                    String lastName = keyboard.nextLine();
                    tempCustomersRoom = firstName + " " + lastName;
                    
                }
            }

            RoomInformation addedRoom = new RoomInformation(tempRoomNumber, tempNumOfBeds, tempIsSuite, tempIsRoomAvailable, tempCustomersRoom);
            listOfRooms.add(addedRoom);
            System.out.println("Room successfully added.");
        } else {
            System.out.println("Room already exists.");
        }
    }

    public static void deleteRoom() {
        System.out.println("Enter the room number to delete:");
        int tempRoomNumber = keyboard.nextInt();
        keyboard.nextLine();
        RoomInformation deletedRoom = searchRooms(tempRoomNumber);

        if (deletedRoom != null) { 
            listOfRooms.remove(deletedRoom);
            System.out.println("Room successfully deleted.");
        } else {
            System.out.println("Room not found.");
        }
    }
    //Update certain aspect of room. i.e. room number, number of beds, room availability.
    public static void updateRoom() {
        String tempCustomersRoom;
        System.out.println("Enter the room number to update:");
        int tempRoomNumber = keyboard.nextInt();
        keyboard.nextLine();
        RoomInformation roomToUpdate = searchRooms(tempRoomNumber);

        if (roomToUpdate != null) {
            System.out.println("Choose what to update (0 to quit):");
            System.out.println("1. Room Number");
            System.out.println("2. Number of Beds");
            System.out.println("3. Room Availability");

            int updateChoice = keyboard.nextInt();
            keyboard.nextLine();

            while (updateChoice == 1 || updateChoice == 2 || updateChoice == 3) { 
                if (updateChoice == 1) {
                    System.out.println("Enter new room number:");
                    tempRoomNumber = keyboard.nextInt();
                    keyboard.nextLine();
                    roomToUpdate.setRoomNumber(tempRoomNumber);
                } 
                else if (updateChoice == 2) {
                    System.out.println("Enter new number of beds:");
                    int tempNumOfBeds = keyboard.nextInt();
                    keyboard.nextLine();
                    roomToUpdate.setNumOfBeds(tempNumOfBeds);
                } 
                else if (updateChoice == 3) {
                    System.out.println("Is room available? (Enter y  or n)");
                    boolean tempIsRoomAvailable = keyboard.nextLine().equalsIgnoreCase("y");
                    roomToUpdate.setIsRoomAvailable(tempIsRoomAvailable);

                    if (!tempIsRoomAvailable) {
                        System.out.println("Is there a customer in this room? (Enter y or n)");
                        if (keyboard.nextLine().equalsIgnoreCase("y")) {
                            System.out.println("Enter customer's first name:");
                            String firstName = keyboard.nextLine();
                            System.out.println("Enter customer's last name:");
                            String lastName = keyboard.nextLine();
                            tempCustomersRoom = firstName + " " + lastName;
                            roomToUpdate.setCustomersRoom(tempCustomersRoom);
                        }
                    }
                    else{
                            
                            roomToUpdate.setCustomersRoom("N/A");
                    }
                    
                }

                System.out.println("Would you like to make more changes? (Enter y or no)");
                if (!keyboard.nextLine().equalsIgnoreCase("y")) {
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
    public static ArrayList<RoomInformation> searchAvailableRooms() {
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
    public static RoomInformation searchRooms(int roomNumber) {
        for (RoomInformation room : listOfRooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    public static void showAllRooms(){
        if (listOfRooms.isEmpty()){
            System.out.println("No Rooms.");
        }
        else{
            for (RoomInformation room :listOfRooms){
                System.out.println(room);                    
            }
        }
    }
}
