package array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] daysOfTheWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(daysOfTheWeek[1]);
        System.out.println(daysOfTheWeek.length);

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) Math.pow(2,i);

        }
        for (int i: numbers){
            System.out.print(i + " ");
        }

        boolean[] trueAndFalse = new boolean[6];
        trueAndFalse[0] = false;
        for (int i = 1; i < trueAndFalse.length; i++){
            trueAndFalse[i] = !trueAndFalse[i-1];
        }

        System.out.println();
        for (boolean i: trueAndFalse){
            System.out.print(i + " ");
        }
    }

}
