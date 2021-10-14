package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Test Client");
        client.setYear(1990);
        client.setAddress("X country Y city, Z road 2");

        System.out.println(client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());

        client.migrate("X country A city B road 10");
        System.out.println("Address successfully changed to: " + client.getAddress());


    }
}
