package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please specify a number");
        int i = sc.nextInt();
        if (i > 100){
            System.out.println("Nagyobb, mint száz");
        } else {
            System.out.println("Száz, vagy kisebb");
        }

    }
}
