package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double solution = 5 * (10+1) / 3D;
        System.out.println("Please solve the following task: 5 * (10+1) / 3");
        double userSolution = sc.nextDouble();

        System.out.println(Math.abs(solution - userSolution) < 0.005 ? "Your solution is correct :) " : "Your solution is incorrect :( ");

    }
}
