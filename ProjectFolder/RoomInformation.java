/*
RoomInformation class for Hotel Reservation
Created by: Cody Sandford and Wyatt Brusseau
Room Information is done, some minor changes may need to be implemented
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
        
        int getRoomNumber(){
            return this.roomNumber;
        }

        int getNumOfBeds(){
            return this.numOfBeds;
        }
        
        boolean getIsSuite(){
            return this.isSuite;
        }
    
        boolean getIsRoomAvailable(){
            this.isRoomAvailable = isRoomAvailable;
        }
        
        String getCustomersRoom(){
            return this.customersRoom;
        }

        
            
