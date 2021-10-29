package stringscanner;

import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify a multi-clause sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Please specify a multi-clause sentence again: ");
        String otherSentence = sc.nextLine();

        System.out.println(sentence);
        Scanner s = new Scanner(otherSentence).useDelimiter(", ");
        while (s.hasNext()){
            System.out.println(s.next());
        }
    }
}
