/*
Hotel Reservation System
Reservation Manager
Created By: Cody Sandford and Wyatt Brusseau
*/
import java.util.Scanner;
import java.util.ArrayList;

public class ReservationManager{
    private static ArrayList<ReservationInformation> listOfReservations;
    private static Scanner keyboard = new Scanner(System.in);
    static final int pricePerNight = 150;
    
    //Constructor
    ReservationManager(){
        this.listOfReservations = new ArrayList<>();
    }

    ArrayList<ReservationInformation> getListOfReservations(){
        return this.listOfReservations;
    }

    //Method to add reservation
    public static void addReservation(){
        System.out.println("Enter Customers License ID");
        String licenseID = keyboard.nextLine();
        CustomerInformation customer = CustomerManager.searchCustomer(licenseID);
        String customerName = customer.getFullName();
        if (searchReservation(customerName) == null){
            System.out.println("How many nights will the customer be staying?");
            int numOfNights = keyboard.nextInt();
            keyboard.nextLine(); //eats new line
            System.out.println("How many rooms does the customer want to book?");
            int numOfRooms = keyboard.nextInt();
            keyboard.nextLine();
            for (int i = 0; i < numOfRooms; i++){
                System.out.println("What room does the customer want to book?");
                int roomNumberCustomerBooked = keyboard.nextInt();
                keyboard.nextLine(); //eats new line
                RoomInformation roomToBook = RoomManager.searchRooms(roomNumberCustomerBooked);
                if (roomToBook != null){
                    roomToBook.setIsRoomAvailable(false);
                    roomToBook.setCustomersRoom(customerName);
                }
                else{
                    System.out.println("Room not found");
                }
            }                            
        }
        else{
            System.out.println("Reservation not found");
        }
    }

    //Method to update reservation
    public static void updateReservation(){
        System.out.println("Who's Reservation do you want to update?");
        String customersReservationToUpdate = keyboard.nextLine();
        ReservationInformation reservationToUpdate = searchReservation(customersReservationToUpdate);
        if (reservationToUpdate != null){
            System.out.println("What would you like to change? (Enter '0' to quit)");
            System.out.println("1. Number of Nights");
            System.out.println("2. Rooms booked");
            int updateDecision = keyboard.nextInt();
            keyboard.nextLine();

            while(updateDecision != 0){
                if (updateDecision == 1){
                    System.out.println("How many nights are they now staying?");
                    int numOfNights = keyboard.nextInt();
                    keyboard.nextLine();
                    reservationToUpdate.setNumOfNights(numOfNights);
                }
                else if (updateDecision == 1){
                    System.out.println("How many rooms does the customer want to book?");
                    int numOfRooms = keyboard.nextInt();
                    keyboard.nextLine();
                    for (int i = 0; i < numOfRooms; i++){
                        System.out.println("What room does the customer want to book?");
                        int roomNumberCustomerBooked = keyboard.nextInt();
                        keyboard.nextLine(); //eats new line
                        RoomInformation roomToBook = RoomManager.searchRooms(roomNumberCustomerBooked);
                        if (roomToBook != null){
                            roomToBook.setIsRoomAvailable(false);
                            roomToBook.setCustomersRoom(customersReservationToUpdate);
                        }
                        else{
                            System.out.println("Room not found");
                        }
                    }
                }    
            }
        }
        else{
            System.out.println("Reservation for customer not found.");
        }
    }

    //Method to delete reservation
    public static void deleteReservation(){
        System.out.print("Enter the Customers Name to delete reservation:");
        String customerName = keyboard.nextLine();
        ReservationInformation deletedReservation = searchReservation(customerName);

        if (deletedReservation != null) { 
            listOfReservations.remove(deletedReservation);
            System.out.println("Room successfully deleted.");
        } else {
            System.out.println("Room not found.");
        }
    }

    //Method to search reservation
    public static ReservationInformation searchReservation(String customerName){
        for (ReservationInformation reservation : listOfReservations){
            if (reservation.getCustomerName().equalsIgnoreCase(customerName)){
                return reservation;
            }
        }
        return null;
    }
}
