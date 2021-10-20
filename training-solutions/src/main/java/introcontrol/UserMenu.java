package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Felhasználók listázása" + "\n" + "2. Felhasználó felvétele" + "\n" + "Többi: Kilépés");
        System.out.println("Please choose a number");
        int i = sc.nextInt();

        if (i == 1 || i ==2){
            if (i == 1){
                System.out.println("Felhasználók listázása");
            } else {
                System.out.println("Felhasználó felvétele");
            }
        }

    }
}
