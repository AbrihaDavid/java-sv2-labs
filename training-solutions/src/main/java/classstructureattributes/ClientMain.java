package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Client client = new Client();


        System.out.println("Please add the client's name:");
        client.name = sc.nextLine();

        System.out.println("Please add the client's year of birth:");
        client.year = sc.nextInt();
        sc.nextLine();

        System.out.println("Please add the client's address:");
        client.address = sc.nextLine();

        System.out.println("The client's name is: " + client.name + ", he/she was born in: " + client.year + ", his/her address is: " + client.address);




    }
}
