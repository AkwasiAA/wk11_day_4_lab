package Hotel;

import Rooms.Bedroom;

public class Booking {

    Bedroom bedroom;
    private int numberOfNights;

    public Booking(Bedroom bedroom, int numberOfNights){
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }
}
