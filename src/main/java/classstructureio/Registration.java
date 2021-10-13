package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your name:");
        String name = scanner.nextLine();

        System.out.println("Input your e-mail address:");
        String email = scanner.nextLine();

        System.out.println("The user registered under the name: " + name + " and with the e-mail: " + email);


    }



}
