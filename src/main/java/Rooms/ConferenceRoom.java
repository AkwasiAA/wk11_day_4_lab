package Rooms;

public class ConferenceRoom extends Room {

    private String roomName;

    public ConferenceRoom(RoomType roomType, int capacity, String roomName){
        super(roomType);
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }
}
