package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers){
        if (numbers == null){
            throw new IllegalArgumentException("Is null");
        }
        int result = 0;
        for (int i = 0; i<numbers.length;i++){
            result += numbers[i];
        }
        return result;
    }

    public int getSum(String[] numbers){
        if (numbers == null){
            throw new IllegalArgumentException("Is null");
        }
        int result = 0;
        for (int i = 0; i<numbers.length;i++){
            try {
                result += Integer.parseInt(numbers[i]);
            }
            catch (NumberFormatException nfe){
                throw new IllegalArgumentException("Not a number");
            }
        }
        return result;
    }
}
