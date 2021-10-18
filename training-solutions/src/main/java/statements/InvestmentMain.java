package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please specify the fund:");
        int fund = sc.nextInt();
        System.out.println("Please specify the interest rate:");
        int interestRate = sc.nextInt();

        Investment inv = new Investment(fund,interestRate);

        System.out.println("The investment fund is: " + fund);
        System.out.println("The interest rate is: " + interestRate);

        System.out.println("Fund: " + fund);
        System.out.println("Yield after 50 days: " + inv.getYield(50));
        System.out.println("Withdrawal after 80 days: " + inv.close(80));
        System.out.println("Withdrawal after 90 days: " + inv.close(90));





    }
}
