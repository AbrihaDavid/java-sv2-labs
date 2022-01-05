package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {

    private List<String> flowerList = new LinkedList<>();

    public BunchOfFlowers(List<String> flowerList) {
        this.flowerList = flowerList;
    }

    public List<String> getFlowerList() {
        return flowerList;
    }

    public void addFlowerInTheMiddle(String flower){
        if (flowerList.size() % 2 == 0){
            flowerList.add(flowerList.size()/2, flower);
        } else {
            flowerList.add(flowerList.size()/2, flower);
            flowerList.add(flowerList.size()/2+1,flower);
        }
    }
}
