import Rooms.ConferenceRoom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, 100, "The Big Yin");
    }

    @Test
    public void canGetRoomName(){
        assertEquals("The Big Yin", conferenceRoom.getRoomName());
    }
}
