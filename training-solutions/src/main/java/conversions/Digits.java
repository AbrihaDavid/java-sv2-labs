package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {

    private List<Integer> digits = new ArrayList<>();

    public List<Integer> getDigits() {
        return digits;
    }

    public void addDigitsToList (String text){
        for (char c: text.toCharArray()){
            try {
                digits.add(Integer.parseInt(String.valueOf(c)));
            } catch (NumberFormatException e){
            }
        }
    }

    public static void main(String[] args) {

        Digits digits = new Digits();
        digits.addDigitsToList("S0m3we1rd Str1ng");
        System.out.println(digits.getDigits());
    }

}
