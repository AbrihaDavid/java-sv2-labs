package looptypes;

public class Sum {

    public void printSums(int[] numbers){
        for (int i = 1; i<numbers.length;i++){
            System.out.print(numbers[i-1]+numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        int[] numbers = {2,3,4,5,6,7};

        sum.printSums(numbers);
    }
}
