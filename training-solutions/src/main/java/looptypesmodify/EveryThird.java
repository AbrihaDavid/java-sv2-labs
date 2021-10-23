package looptypesmodify;

import java.util.Arrays;

public class EveryThird {

    public void changeToZero (int[] numbers){
        for (int i = numbers.length-1; i>=0;i=i-3){
            numbers[i] = 0;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        EveryThird et = new EveryThird();
        int[] numbers = {2,3,4,5,67,10,8,9,20,2,8,7,4,2};
        et.changeToZero(numbers);
    }
}
