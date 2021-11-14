package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please specify your name");
        String name = sc.nextLine();
        System.out.println("Please specify the title of the movie");
        String title = sc.nextLine();
        System.out.println("Please specify the number of tickets you wish to purchase");
        int tickets = sc.nextInt();
        sc.nextLine();
        System.out.println("Please specify which row you want to buy the ticket(s) for ");
        int row = sc.nextInt();

        System.out.print("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:" + "\n" +
                "Vásárló neve: " + name + "\n" +
                "Film címe: " + title + "\n" +
                "Lefoglalt helyek: ");
        for (int i = 1; i <= tickets; i++) {
            if (i == tickets) {
                System.out.print(row + ". sor " + i + ". szék");
            } else {
                System.out.print(row + ". sor " + i + ". szék, ");
            }
        }
        System.out.println();
        System.out.println("Jó szórakozást!");
    }
}
