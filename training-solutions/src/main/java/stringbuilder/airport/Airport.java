package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void getDeletedFlights() {
        System.out.println("Törölt járatok: ");
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getStatus() == Status.DELETED) {
                System.out.println(flights.get(i).getFlightNumber());
            }
        }
    }

    public static void main(String[] args) {

        Airport airport = new Airport();
        Flight flightOne = new Flight("B-4214",Status.DELETED);
        Flight flightTwo = new Flight("D-222",Status.ACTIVE);
        Flight flightThree = new Flight("SD-013",Status.DELETED);
        Flight flightFour = new Flight("KI-102030",Status.DELETED);
        airport.addFlight(flightOne);
        airport.addFlight(flightTwo);
        airport.addFlight(flightThree);
        airport.addFlight(flightFour);

        airport.getDeletedFlights();
    }
}
