package sorting;

import java.util.Arrays;

public class Income {

    private int[] incomes = {300,800,32,76,12,924,7347,52,4,98};

    public int getHighestIncome(){
        Arrays.sort(incomes);
        return incomes[incomes.length-1];
    }
}
