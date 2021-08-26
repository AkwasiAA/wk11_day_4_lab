package Hotel;

import Guests.Guest;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
       this.bedrooms = new ArrayList<>();
       this.conferenceRooms = new ArrayList<>();
    }

    public void checkInGuest(Bedroom bedroom, Guest guest){
       bedroom.addGuest(guest);
    }

//    public void checkOutGuest()


}
