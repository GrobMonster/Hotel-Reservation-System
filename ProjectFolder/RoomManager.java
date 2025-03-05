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
    boolean updateRoom(RoomInformation room){
        for (int i=0; i < (listOfRooms.size()); i++){
            if listOfRooms.get(i).getRoomNumber() == room.getRoomNumber()){
                listOfRooms.set(i, room);
                return true;
            }
            else{
                return false;
            }        
        }
    }

    RoomInformation searchAvailableRooms(RoomInformation room){
        for (int i=0; i < listOfRooms.size(); i++){
            if (listOfRooms.get(i).getIsRoomAvailable() == true){
                return listOfRooms.get(i);
            }
            else{
                return null;
            }
        }
    }
    
}
