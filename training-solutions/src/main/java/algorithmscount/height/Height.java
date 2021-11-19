package algorithmscount.height;

import java.util.List;

public class Height {

    public int countChildrenWithHeightGreaterThan(List<Integer> heightList, int minHeight){
        int count = 0;
        for (int i = 0; i<heightList.size();i++){
            if (heightList.get(i) >= minHeight){
                count++;
            }
        }
        return count;
    }
}
