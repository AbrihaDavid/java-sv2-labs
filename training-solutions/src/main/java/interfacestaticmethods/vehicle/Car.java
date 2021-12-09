package interfacestaticmethods.vehicle;

public class Car implements Vehicle{

    private String band;
    private int numberOfWheels;

    public Car(String band) {
        this.band = band;
    }

    public Car(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Car(String band, int numberOfWheels) {
        this.band = band;
        this.numberOfWheels = numberOfWheels;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
