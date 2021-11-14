package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Validation validation = new Validation();
        System.out.println("Welcome");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify your name");
        String name = sc.nextLine();
        boolean legitRegistration = true;
        try {
            validation.validateName(name);
        }
        catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
            legitRegistration = false;
        }
        System.out.println("Please specify your age");
        String age = sc.nextLine();
        try {
            validation.validateAge(age);
        }
        catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
            legitRegistration = false;
        }
        System.out.println("Provided information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if (legitRegistration){
            System.out.println("Registration successful");
        } else {
            System.out.println("Registration is not successful");
        }

    }
}
