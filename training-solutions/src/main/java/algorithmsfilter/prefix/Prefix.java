package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {

    public List<String> getWordsStartWith (List<String> words, String prefix){

        List<String> wordsWithPrefix = new ArrayList<>();
        for (String s: words){
            if (s.startsWith(prefix)){
                wordsWithPrefix.add(s);
            }
        }
        return wordsWithPrefix;
    }
}
