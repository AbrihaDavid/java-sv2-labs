package collectionsset;

import java.util.*;

public class QuestionGame {

    private List<RightAnswer> rightAnswers = new ArrayList<>();

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public Set<String> drawWinners(){
        Set<String> winners = new HashSet<>();
        Collections.shuffle(rightAnswers);

        while (winners.size() < 5){
            if (rightAnswers.isEmpty()){
                throw new IllegalArgumentException("List is empty");
            }
            String winnerName = rightAnswers.get(0).getName();
            if (!winners.contains(winnerName)){
                winners.add(winnerName);
                rightAnswers.remove(0);
            } else {
                rightAnswers.remove(0);
            }
        }
        return winners;
    }
}

