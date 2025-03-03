/*
RoomInformation class for Hotel Reservation
Created by: Cody Sandford and Wyatt Brusseau

*/
class RoomInformation{
        int roomNumber;
        int numOfBeds;
        boolean isSuite;
        boolean isRoomAvailable;
        String customersRoom

        //Constructors
        RoomInformation(int roomNumber, int numOfBeds, boolean isSuite, boolean isRoomAvailable){
            this.roomNumber = roomNumber;
            this.numOfBeds = numOfBeds;
            this.isSuite = isSuite;
            this.isRoomAvailable = isRoomAvailable;
            this.customersRoom = customersRoom;
        }
        RoomInformation(){
            this.roomNumber = 0;
            this.numOfBeds = 0;
            this.isSuite = false;
            this.isRoomAvailable = false;
            this.customersRoom = "N/A";
        }

        //Getters and Setters
        setRoomNumber(RoomInformation room){
            this.roomNumber = roomNumber;
        }

        setNumOfBeds(RoomInformation room){
            this.numOfBeds = numOfBeds;
        }
        
        setIsSuite(RoomInformation room){
            this.isSuite = isSuite;
        }
    
        setIsRoomAvailable(RoomInformation room){
            this.isRoomAvailable = isRoomAvailable;
        }
        
        setCustomersRoom(RoomInformation room){
            this.customersRoom = customersRoom;
        }
        
        int getRoomNumber(RoomInformation room){
            return this.roomNumber;
        }

        int getNumOfBeds(RoomInformation room){
            return this.numOfBeds;
        }
        
        boolean getIsSuite(RoomInformation room){
            return this.isSuite;
        }
    
        boolean getIsRoomAvailable(RoomInformation room){
            this.isRoomAvailable = isRoomAvailable;
        }
        
        String getCustomersRoom(RoomInformation room){
            return this.customersRoom;
        }
        //Methods
        
            
