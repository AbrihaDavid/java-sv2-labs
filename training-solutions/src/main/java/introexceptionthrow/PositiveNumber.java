package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {

    public boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify a positive number");
        String i = sc.nextLine();

        if (!new PositiveNumber().isNumeric(i)){
            throw new IllegalArgumentException("Not a number");
        }
        if (Integer.parseInt(i) < 0){
            throw new IllegalArgumentException("Not a positive number!");
        }

    }
}
