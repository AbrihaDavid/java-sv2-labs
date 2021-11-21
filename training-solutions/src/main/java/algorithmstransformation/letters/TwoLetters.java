package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {

    public List<String> getFirstTwoLetters(List<String> wordList){

        List<String> firstTwoWordList = new ArrayList<>();

        for (String s: wordList){
            firstTwoWordList.add(s.substring(0,2));
        }
        return firstTwoWordList;
    }
}
