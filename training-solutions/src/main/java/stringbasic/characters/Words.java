package stringbasic.characters;

import java.util.Arrays;
import java.util.Scanner;

public class Words {

    public String simpleApplication (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify a word");
        String word = sc.nextLine();
        System.out.println("You have to spell the following word: " + word);
        System.out.println("Type the answer character by character: ");

        char [] characters = new char [word.length()];

        for (int i = 0; i<word.length();i++){
            String answerChar = sc.nextLine();
            characters[i] = answerChar.toCharArray()[0];
            System.out.println(answerChar);
        }
        System.out.println("You have given the word: " + String.valueOf(characters));
        return String.valueOf(characters).equals(word) ? "Your answer is correct" : "Your answer is incorrect";
    }

    public static void main(String[] args) {

        Words words = new Words();
        System.out.println(words.simpleApplication());
    }
}
