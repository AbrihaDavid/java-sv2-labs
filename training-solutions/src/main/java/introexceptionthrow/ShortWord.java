package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify a word with a maximum of 5 characters");
        String word = sc.nextLine();
        if (word.length() > 5){
            throw new IllegalArgumentException("The provided word is longer than 5 chars: " + word);
        }
        boolean otherChar = true;
        for (int i = 0; i < word.length(); i++){
            if (!Character.isLetter(word.charAt(i))){
                otherChar = false;
                break;
            }
        }
        if (otherChar == false){
            throw new IllegalArgumentException("The provided word contains a char other than a letter");
        }
        System.out.println(word);
    }
}
