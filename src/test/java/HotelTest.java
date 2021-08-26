import Guests.Guest;
import Hotel.Hotel;
import Hotel.Booking;
import Rooms.Bedroom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Bedroom bedroom;
    Booking booking;



    @Before
    public void before(){
        hotel = new Hotel();
        guest = new Guest(" Jakub Pfizer");
        bedroom = new Bedroom(RoomType.TRIPLE, 3, 103);
    }

    @Test
    public void canCheckInGuests(){
        hotel.checkInGuest(bedroom, guest);
        assertEquals(1, bedroom.getNumberOfGuestsInRoom());
    }

    @Test
    public void canCheckOutGuests(){
        hotel.checkInGuest(bedroom, guest);
        hotel.checkOutGuest(bedroom, guest);
        assertEquals(0, bedroom.getNumberOfGuestsInRoom());
    }

    @Test
    public void canMakeNewBooking(){
        hotel.bookRoom(bedroom, 5);
        assertEquals(1, hotel.guestHasBooking());
    }

}
