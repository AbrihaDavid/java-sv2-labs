package introexceptionfinally;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (i%2 !=0){

            try {
                System.out.println("Please add a number");
                i = sc.nextInt();
                sc.nextLine();
            }
            catch (NumberFormatException nfe){
                throw new IllegalArgumentException("Not a number",nfe);
            }
            finally {
                System.out.println("End of round");
            }
        }
    }
}
