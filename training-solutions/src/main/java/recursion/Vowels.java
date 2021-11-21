package recursion;

public class Vowels {

    public int getNumberOfVowels(String word) {
        if (word.length() > 0) {
            if ("AEIOUaeiou".indexOf(word.charAt(0)) != -1) {
                return 1 + getNumberOfVowels(word.substring(1));
            } else {
                return getNumberOfVowels(word.substring(1));
            }
        }
        return 0;
    }
}
