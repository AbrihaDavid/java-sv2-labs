package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please specify a number:");
        int x = sc.nextInt();
        System.out.println(x % 3 == 0 ? x+" can be divided by 3" : x+ " can't be divided by 3");

    }
}
