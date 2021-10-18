package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please specify the first time (the order is: hour -- minute -- second):");
        Time timeOne = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("The first time is: " + timeOne.toString() + " = " + timeOne.getInMinutes() + " minutes");

        System.out.println("Please specify the second time (the order is: hour -- minute -- second):");
        Time timeTwo = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("The second time is: " + timeTwo.toString() + " = " + timeTwo.getInSeconds() + " seconds");

        System.out.println("The first time is earlier than the second time: " + timeOne.earlierThan(timeTwo));


    }

}
