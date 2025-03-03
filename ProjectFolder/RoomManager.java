/* 
Hotel Reservation System
Created by: Cody Sandford & Wyatt Brusseau

*/

public class RoomManager(String[] args){
    private ArrayList<RoomInformation> listOfRooms;

    RoomList(RoomInformation){
        this.listOfRooms = new ArrayList<RoomInformation>;
    }

    ArrayList<RoomInformation> getListOfRooms(){
        return this.listOfRooms
    }

    addRoom(RoomInformation room){
        listOfRooms.add(room);
    }
    updateRoom(RoomInformation room, ArrayList<RoomInformation>, listOfRooms){
        for (i=0; i < (listOfRooms.length); i++){
            if listOfRooms[i].RoomInformation.getRoomNumber == room.RoomInformation.getRoomNumber){
                listOfRooms[i] = room;
                return true
            }
            //else{
                
        }
    }
