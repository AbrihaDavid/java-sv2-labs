package interfacedefaultmethods.seats;

public class Car implements Seat{

    private String band;
    private int numberOfSeats;

    public Car(String band, int numberOfSeats) {
        this.band = band;
        this.numberOfSeats = numberOfSeats;
    }

    public String getBand() {
        return band;
    }

    @Override
    public int getNumberOfSeats() {
        return numberOfSeats;
    }


}
