package inheritancemethods.plane;

public class Plane {

    public static void main(String[] args) {

        Passenger passenger = new Passenger("John Doe",50000);
        System.out.println(passenger.getName());
        System.out.println(passenger.getPriceOfPlaneTicket());

        PriorityPassenger priorityPassenger = new PriorityPassenger("Jack Doe",50000,50);
        System.out.println(priorityPassenger.getName());
        System.out.println(priorityPassenger.getPriceOfPlaneTicket());
        System.out.println(priorityPassenger.getPercent());

        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Jill Doe",50000,50);
        System.out.println(firstClassPassenger.getName());
        System.out.println(firstClassPassenger.getPriceOfPlaneTicket());
        System.out.println(firstClassPassenger.getPercent());
        System.out.println(firstClassPassenger.getExtraCharge());
    }
}
