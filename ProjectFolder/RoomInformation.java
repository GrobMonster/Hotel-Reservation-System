/*
RoomInformation class for Hotel Reservation
Created by: Cody Sandford and Wyatt Brusseau

*/
class RoomInformation{
        int roomNumber;
        int numOfBeds;
        boolean isSuite;
        boolean isRoomAvailable;
        String customersRoom;

        //Constructors
        RoomInformation(int roomNumber, int numOfBeds, boolean isSuite, boolean isRoomAvailable, String customersRoom){
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
        void setRoomNumber(int roomNumber){
            this.roomNumber = roomNumber;
        }

        void setNumOfBeds(int numOfBeds){
            this.numOfBeds = numOfBeds;
        }
        
        void setIsSuite(boolean isSuite){
            this.isSuite = isSuite;
        }
    
        void setIsRoomAvailable(boolean isRoomAvailable){
            this.isRoomAvailable = isRoomAvailable;
        }
        
        void setCustomersRoom(String customersRoom){
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

        
            
