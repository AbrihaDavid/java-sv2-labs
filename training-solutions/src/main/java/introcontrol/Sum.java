package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i<5;i++){
            System.out.println("Please specify a number");
            int adder = sc.nextInt();
            sum = sum + adder;
        }
        System.out.println(sum);
    }

}
