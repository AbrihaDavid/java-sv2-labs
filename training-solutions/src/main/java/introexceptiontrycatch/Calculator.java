package introexceptiontrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify the first number");
        int numberOne = 0;
        int numberTwo = 0;
        try {
             numberOne = sc.nextInt();
        }
        catch (InputMismatchException ime){
            System.out.println("Not a number");
        }
        sc.nextLine();
        System.out.println("Please specify the second number");
        try {
             numberTwo = sc.nextInt();
        }
        catch (InputMismatchException ime){
            System.out.println("Not a number");
        }
        sc.nextLine();

        System.out.println("Please specify the chosen arithmetic expression: 1) addition; 2) subtraction; 3) multiplication; 4) division ");
        try {
            String arithmeticExpression = sc.nextLine();
            switch (arithmeticExpression) {
                case "1":
                    System.out.println(numberOne + numberTwo);
                    break;
                    case "2":
                        System.out.println(numberOne - numberTwo);
                        break;
                    case "3":
                        System.out.println(numberOne*numberTwo);
                        break;
                    case "4":
                        System.out.println(numberOne/numberTwo);
                        break;
                    default:
                        System.out.println("Not a valid expression");
                }
        }
        catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}

