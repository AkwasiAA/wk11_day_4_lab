package Rooms;

public class Bedroom extends Room {

    private int roomNumber;

    public Bedroom(RoomType roomType, int capacity, int roomNumber){
        super(roomType);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }


}
