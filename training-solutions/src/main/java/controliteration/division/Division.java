package controliteration.division;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiírni.");
        int num = sc.nextInt();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int div = sc.nextInt();

        for (int i = 1; i<num; i++){
            if (i%div == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println();

        int i = 1;
        while (i < num){
            if (i%div == 0){
                System.out.print(i + ", ");
                i++;
            }
            i++;
        }
    }
}
