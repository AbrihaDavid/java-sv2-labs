package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Song song = new Song();

        System.out.println("Please enter the name of the artist of you favorite song:");
        song.band = sc.nextLine();

        System.out.println("Please enter the name of your favorite song:");
        song.title = sc.nextLine();

        System.out.println("Please enter the length of your favorite song (rounded to the nearest whole minute):");
        song.length = sc.nextInt();

        System.out.println(song.band + " - " + song.title + " (" + song.length + " perc)!");




    }
}
