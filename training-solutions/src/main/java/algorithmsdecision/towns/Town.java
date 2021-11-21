package algorithmsdecision.towns;

import java.util.List;

public class Town {

    public boolean containsFewerHabitants (List<Integer> habitantList, int min){

        for (Integer i: habitantList){
            if (i<min){
                return true;
            }
        }
        return false;
    }
}
