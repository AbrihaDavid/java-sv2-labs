package Primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify your name:");
        String name = sc.nextLine();
        System.out.println("Please specify your date of birth (yyyy-mm-dd):");
        String dateOfBirth = sc.nextLine();
        System.out.println("Please specify your zip code:");
        String zipCode = sc.nextLine();
        System.out.println("Please specify your average scores:");
        String averageOfScores = sc.nextLine();

        LocalDate dateOfBirthInLocalDate = LocalDate.parse(dateOfBirth);
        int zipCodeInInt = Integer.parseInt(zipCode);
        double averageOfScoresInDouble = Double.parseDouble(averageOfScores);

        Exam exam = new Exam();
        Person person = new Person(name,dateOfBirthInLocalDate,zipCodeInInt,averageOfScoresInDouble);
        exam.addPerson(person);

        System.out.println(person.toString());




    }
}
