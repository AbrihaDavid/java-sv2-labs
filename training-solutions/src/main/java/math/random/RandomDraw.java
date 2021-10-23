package math.random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Bob","Tom","Bill","Jill","Jack","John","Jane","David","Dani","Rose");
        Random rnd = new Random();
        int firstWinner = rnd.nextInt(1,6);
        int secondWinner = rnd.nextInt(6,11);
        System.out.println("The first winner is: " + names.get(firstWinner-1));
        System.out.println("The second winner is: " + names.get(secondWinner-1));

    }
}
