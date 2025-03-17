/*
Hotel Reservation System
Reservation Information
Created by: Cody Sandford and Wyatt Brusseau

*/

public class ReservationInformation{
    private double pricePerNight;
    private int numOfNights;
    ArrayList<int> customersRoomNumbers;
    String customerName;

    //Constructors
    ReservationInformation(){
        this.pricePerNight = 0.0;
        this.numOfNights = 0;
        this.customersRoomNumbers = null;
        this.customerName = "N/A";
    }
    
    ReservationInformation(double pricePerNight, int numOfNights, ArrayList<int> customersRoomNumbers, String customerName){
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
    void setCustomersRoomNumbers(ArrayList<int> customersRoomNumbers){
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
    ArrayList<int> getCustomersRoomNumbers(){
        return this.customersRoomNumbers;
    }
    String getCustomerName(){
        return this.customerName;
    }
}
