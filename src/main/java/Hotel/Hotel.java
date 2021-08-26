package Hotel;

import Guests.Guest;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Guest> guests;

    public Hotel(ArrayList bedrooms, ArrayList conferenceRooms){
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.guests = new ArrayList<Guest>();
    }

    public void checkInGuest()


}
