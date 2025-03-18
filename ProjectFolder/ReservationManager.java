/*
Hotel Reservation System
Reservation Manager
Created By: Cody Sandford and Wyatt Brusseau
*/
import java.util.Scanner;
import java.util.ArrayList;

public class ReservationManager{
    private ArrayList<ReservationInformation> listOfReservations;
    private Scanner keyboard = new Scanner(System.in);
    static int pricePerNight = 150, 
    private int numOfNights;
    ArrayList<Integer> customerRoomNumbers;
    String customerName;
    
    //Constructor
    ReservationManager(){
        this.listOfReservations = new ArrayList<>();
    }

    ArrayList<ReservationInformation> getListOfReservations(){
        return this.listOfReservations;
    }

    void addReservation(){
        System.out.println("Enter Customers License ID");
        String licenseID = keyboard.nextLine();
        CustomerInformation customer = searchCustomer(licenseID);
        customerName = customer.getFullName();
        if (searchReservation(customersName) == null){
            System.out.println("How many nights will the customer be staying?");
            numOfNights = keyboard.nextInt();
            keyboard.nextLine(); //eats new line
            System.out.println("How many rooms does the customer want to book?");
            int numOfRooms = keyboard.nextInt();
            keyboard.nextLine();
            for (int i = 0; i < numOfRooms; i++){
                System.out.println("What room does the customer want to book?");
                int roomNumberCustomerBooked = keyboard.nextInt();
                keyboard.nextLine(); //eats new line
                RoomInformation roomToBook = searchRooms(roomNumberCustomerBooked);
                if (roomToBook != null){
                    roomToBook.setIsRoomAvailable(false);
                    roomToBook.setCustomerName(customersName);
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

    void updateReservation(){
        System.out.println("Who's Reservation do you want to update?");
        customersReservationToUpdate = keyboard.nextLine();
        ReservationInformation reservationToUpdate = searchReservation(customersReservationToUpdate);
        if (reservationToUpdate != null){
            System.out.println("What would you like to change? (Enter "0" to quit)");
            System.out.println("1. Number of Nights");
            System.out.println("2. Rooms booked");
            updateDecision = keyboard.nextInt();
            keyboard.nextLine();

            while(updateDecision != 0){
                if (updateDecision == 1){
                    System.out.println("How many nights are they now staying?")
                    numOfNights = keyboard.nextInt();
                    keyboard.nextLine();
                }
            }
            
        }
    }

    void deleteReservation(){

    }

    ReservationInformation searchReservation(String customerName){
        for (ReservationInformation reservation : listOfReservations){
            if (reservation.getCustomerName().equalsIgnoreCase(customerName){
                return reservation;
            }
        }
        return null;
    }
}

