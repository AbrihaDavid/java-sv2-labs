package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {

    List<String> winners = new ArrayList<>(Arrays.asList("Joe",null,"Tom","Jack","Jill","Bob"));

    public String getWinner(){
        Random random = new Random();
        int winnerIndex = random.nextInt(0,winners.size());
        return winners.get(winnerIndex).toUpperCase();
    }
}
