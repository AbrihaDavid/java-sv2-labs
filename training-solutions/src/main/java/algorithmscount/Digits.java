package algorithmscount;

public class Digits {

    public int getCountOfNumbers() {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            String num = String.valueOf(i);
            char[] digits = num.toCharArray();
            if (Math.abs(digits[0] - digits[1]) == 5) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        System.out.println(new Digits().getCountOfNumbers());
    }
}
