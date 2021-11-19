package algorithmsmax.temperature;

import java.util.List;

public class Temperature {

    public int getMin (List<Integer> integers){
        int min = Integer.MAX_VALUE;

        for (Integer i: integers){
            if (i < min){
                min = i;
            }
        }
        return min;
    }
}
