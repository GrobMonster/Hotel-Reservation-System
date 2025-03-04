/* 
Hotel Reservation System
Created by: Cody Sandford & Wyatt Brusseau

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
    updateRoom(RoomInformation room){
        for (int i=0; i < (listOfRooms.length); i++){
            if listOfRooms.get(i).getRoomNumber() == room.getRoomNumber){
                listOfRooms.set(i, room);
                return true;
            }
            else{
                return false;
            }
                
        }
    }
}
