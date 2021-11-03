package controlselection.consonant;

public class ToConsonant {

    public char getNextConsonant (char c){
        String vowels = "aeiouAEIOU";
        if (vowels.contains(Character.toString(c))){
            return (char) (c + 1);
        } else {
            return c;
        }
    }
}
