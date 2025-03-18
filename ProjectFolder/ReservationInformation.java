/*
Hotel Reservation System
Reservation Information
Created by: Cody Sandford and Wyatt Brusseau

*/
import java.util.ArrayList;
public class ReservationInformation{
    private double pricePerNight;
    private int numOfNights;
    ArrayList<Integer> customersRoomNumbers;
    String customerName;

    //Constructors
    ReservationInformation(){
        this.pricePerNight = 0.0;
        this.numOfNights = 0;
        this.customersRoomNumbers = new ArrayList<>();
        this.customerName = "N/A";
    }
    
    ReservationInformation(double pricePerNight, int numOfNights, ArrayList<Integer> customersRoomNumbers, String customerName){
        this.pricePerNight = pricePerNight;
        this.numOfNights = numOfNights;
        this.customersRoomNumbers = customersRoomNumbers;
        this.customerName = customerName;
    }

    //SETTERS
    void setPricePerNight(double pricePerNight){
        this.pricePerNight = pricePerNight;
    }
    void setNumOfNights(int numOfNights){
        this.numOfNights = numOfNights;
    }
    void setCustomersRoomNumbers(ArrayList<Integer> customersRoomNumbers){
        this.customersRoomNumbers = customersRoomNumbers;
    }
    void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    //GETTERS
    double getPricePerNight(){
        return this.pricePerNight;
    }
    int getNumOfNights(){
        return this.numOfNights;
    }
    ArrayList<Integer> getCustomersRoomNumbers(){
        return this.customersRoomNumbers;
    }
    String getCustomerName(){
        return this.customerName;
    }

    public String toString(){
        return "Reservation for: " + customerName + "\nRooms: " + customersRoomNumbers + "\nPrice per Night: $" + pricePerNight + "\nNumber of Nights: " + numOfNights;
    }
}
