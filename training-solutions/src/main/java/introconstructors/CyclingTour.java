package introconstructors;


import java.time.LocalDate;

public class CyclingTour {

    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void registerPerson (int person){
        numberOfPeople = numberOfPeople + person;
    }

    public void ride (double km){
        kms = kms + km;
    }

    public static void main(String[] args) {

        CyclingTour cyclingTour = new CyclingTour("Good tour",LocalDate.now());
        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());
        cyclingTour.registerPerson(100);
        cyclingTour.ride(20);
        System.out.println(cyclingTour.getKms());
        System.out.println(cyclingTour.getNumberOfPeople());
    }
}
