package arrays;

import java.util.Arrays;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int b = 0; b < size; b++) {
                multiplicationTable[i][b] = (i + 1) * (b + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempVaules(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public boolean sameTempVaulesDayLight(double[] day, double[] anotherDay) {
        int min = Math.min(day.length, anotherDay.length);
        double[] dayRange = Arrays.copyOfRange(day, 0, min);
        double[] anotherDayRange = Arrays.copyOfRange(anotherDay, 0, min);
        return Arrays.equals(dayRange, anotherDayRange);
    }

    boolean wonLottery(int[] pickedValues, int[] actualValues) {
        int[] pickedValuesCopy = Arrays.copyOf(pickedValues,pickedValues.length);
        int[] actualValuesCopy = Arrays.copyOf(actualValues,actualValues.length);
        Arrays.sort(pickedValuesCopy);
        Arrays.sort(actualValuesCopy);
        return Arrays.equals(pickedValuesCopy, actualValuesCopy);
    }

    public static void main(String[] args) {
        ArraysMain am = new ArraysMain();

        System.out.println(am.numberOfDaysAsString());
        System.out.println(am.multiplicationTableAsString(5));

        System.out.println(am.sameTempVaules(new double[]{10.5, 10.7, 10.9}, new double[]{10.5, 10.7, 10.9}));
        System.out.println(am.sameTempVaulesDayLight(new double[]{10.5, 10.7, 10.9, 10.5, 20.5}, new double[]{10.5, 10.7, 10.9}));

        int[] pickedValues = {5, 4, 2, 3, 1};
        int[] actualValues = {1, 2, 3, 4, 5};
        System.out.println(am.wonLottery(pickedValues,actualValues));
        System.out.println(Arrays.toString(pickedValues));
        System.out.println(Arrays.toString(actualValues));
    }
}
