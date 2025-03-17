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
        
        void setCustomersRoom(CustomerInformation customer){
            this.customersRoom = customer.getFullName();
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
            return this.isRoomAvailable;
        }
        
        String getCustomersRoom(){
            return this.customersRoom;
        }

        public String toString() {
            return "Room Number: " + roomNumber + "\nNumber of Beds: " + numOfBeds + "\nSuite: " + (isSuite ? "Yes" : "No") + "\nAvailable: " + (isRoomAvailable ? "Yes" : "No") + "\nCustomers Name in Room: " + customersRoom + "\n";
        }
}
        
            
