package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> favouriteThings = new ArrayList<>();

        System.out.println("Please specify your favorite animal");
        favouriteThings.add(sc.nextLine());
        System.out.println("Please specify your favorite word");
        favouriteThings.add(sc.nextLine());
        System.out.println("Please specify your favorite country");
        favouriteThings.add(sc.nextLine());
        System.out.println("Please specify your favorite band");
        favouriteThings.add(sc.nextLine());

        System.out.println(favouriteThings.size());
        System.out.println(favouriteThings);


    }
}
