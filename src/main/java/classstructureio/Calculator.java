package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first integer:");
        int firstInt = scanner.nextInt();
        System.out.println("Input the second integer:");
        int secondInt = scanner.nextInt();

        System.out.println(firstInt + " + " + secondInt);
        System.out.println(firstInt+secondInt);

    }


}
