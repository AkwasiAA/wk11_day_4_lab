package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private ArrayList <Guest> guests;

    public Room(RoomType roomType){
        this.roomType = roomType;
        this.guests = new ArrayList<Guest>();

    }

    public RoomType getRoomType() {
        return roomType;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getCapacity() {
        return roomType.getCapacity();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public int getNumberOfGuestsInRoom(){
        return this.guests.size();
    }


}
