package mathproblems;

public class Division {

    public void getDivisors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(number + " osztója: " + i);
            }
        }
    }


    public void getRightNumbers (int[] numbers){
        for (int i =0; i< numbers.length; i++){
            if (i==0){
                continue;
            }
            if (numbers[i] % i ==0){
                System.out.print(numbers[i] + " ");
            }
        }
    }


    public static void main(String[] args) {

        Division division = new Division();

        division.getDivisors(34);
        int [] nums = {2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10};
        division.getRightNumbers(nums);
    }
}
