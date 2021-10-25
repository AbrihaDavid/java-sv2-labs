package chars;

public class LettersAndDigits {

    public void printLetterOrDigit (String text){
        for (char c: text.toCharArray()){
            if (Character.isAlphabetic(c)){
                System.out.println(c + " : " + "betű");
            } else if (Character.isDigit(c)) {
                System.out.println((c + " : " + "számjegy"));
            } else {
                System.out.println(c + " : " + "egyéb");
            }
        }
    }

    public static void main(String[] args) {

        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        lettersAndDigits.printLetterOrDigit("S0mew3!rd$tr1ng");
    }
}
