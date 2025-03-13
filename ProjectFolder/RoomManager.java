/* 
Hotel Reservation System
Created by: Cody Sandford & Wyatt Brusseau

This code is not fully done. Still need a delete room method and figure out if we want a file that holds all rooms so it doesn't get lost after everytime we run program.
*/

public class RoomManager{
    private ArrayList<RoomInformation> listOfRooms;

    RoomManager(RoomInformation){
        this.listOfRooms = new ArrayList<>();
    }

    ArrayList<RoomInformation> getListOfRooms(){
        return this.listOfRooms;
    }

    void addRoom(RoomInformation room){
        listOfRooms.add(room);
    }
    
    boolean deleteRoom(int roomNumber) {
    return listOfRooms.removeIf(room -> room.getRoomNumber() == roomNumber);
    }
    
    boolean updateRoom(RoomInformation room){
        for (RoomInformation room : listOfRooms){
            if listOfRooms.get(room).getRoomNumber() == room.getRoomNumber()){
                listOfRooms.set(room, room);
                return true;
            }
        }
        return false;        
    }
    // Method to check for all available rooms
    List<RoomInformation> searchAvailableRooms() {
        List<RoomInformation> availableRooms = new ArrayList<>();
        for (RoomInformation room : listOfRooms) {
            if (room.getIsRoomAvailable()) {
                availableRooms.add(room);
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
