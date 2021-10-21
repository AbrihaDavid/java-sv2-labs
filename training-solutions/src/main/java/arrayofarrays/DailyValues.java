package arrayofarrays;

import java.time.LocalDate;

public class DailyValues {

    public int [][] getValues(){
        int [][] array = new int[12][];

        for (int i = 0; i<12;i++){
            LocalDate date = LocalDate.of(2021,i+1,1);
            array[i] = new int [date.lengthOfMonth()];
        }
        return array;
    }

    public static void main(String[] args) {

        DailyValues dv = new DailyValues();
        for (int []i: dv.getValues()){
            for (int k: i){
                System.out.print(k+" " );
            }
            System.out.println();
        }
    }
}
