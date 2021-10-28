package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome (String word){
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        return word.equalsIgnoreCase(stringBuilder.toString());
    }

    public static void main(String[] args) {

        PalindromeValidator palindromeValidator = new PalindromeValidator();

        System.out.println(palindromeValidator.isPalindrome("saippuakivikauppias"));
    }
}
