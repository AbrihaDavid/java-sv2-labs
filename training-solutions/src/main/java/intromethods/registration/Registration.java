package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public String getFullName (String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public LocalDate getFullBirthdate(int year, int month, int day){
        return LocalDate.of(year,month,day);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please specify your first name:");
        String firstName = sc.nextLine();
        System.out.println("Please specify your last name:");
        String lastName = sc.nextLine();

        System.out.println("Please specify the year you were born:");
        int year = sc.nextInt();
        System.out.println("Please specify the month you were born:");
        int month = sc.nextInt();
        System.out.println("Please specify the day you were born:");
        int day = sc.nextInt();
        sc.nextLine();

        System.out.println("Please specify your e-mail address:");
        String email = sc.nextLine();

        Registration registration = new Registration();
        Person person = new Person(registration.getFullName(firstName,lastName), registration.getFullBirthdate(year,month,day), email);
        System.out.println(person);

    }
}
