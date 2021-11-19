package algorithmsmax.hill;

import java.util.List;

public class Hill {

    public int getMax(List<Integer> integers){
        int max = Integer.MIN_VALUE;

        for(Integer i: integers){
            if (i>max){
                max = i;
            }
        }
        return max;
    }
}
