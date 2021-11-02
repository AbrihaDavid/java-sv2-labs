package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {

    List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord (String word){
        words.add(word);
    }

    public void getWordsStartWith (String prefix){
        List<String> deletedWords = new ArrayList<>();
        for (String each: words){
            if (!each.startsWith(prefix)){
                deletedWords.add(each);
            }
        }
        words.removeAll(deletedWords);
    }

    public void getWordsWithLength (int length){
        List<String> deletedWords = new ArrayList<>();
        for (String each: words){
            if (each.length() != length){
                deletedWords.add(each);
            }
        }
        words.removeAll(deletedWords);
    }
}
