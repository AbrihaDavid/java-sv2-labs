package algorithmsdecision.words;

import java.util.List;

public class Word {

    public boolean containsLongerWord (List<String> wordList, String actualWord){

        for (String s: wordList){
            if (s.length() > actualWord.length()){
                return true;
            }
        }
        return false;
    }
}
