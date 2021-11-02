package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {

    Words words;

    @BeforeEach
    void init (){
        words = new Words();
        words.addWord("Dog");
        words.addWord("Cat");
        words.addWord("Mouse");
        words.addWord("Horse");
        words.addWord("Ant");
        words.addWord("Cow");
    }

    @Test
    void testGetWordsStartWith(){
        List<String> correctWords = Arrays.asList("Cat","Cow");
        words.getWordsStartWith("C");
        assertEquals(correctWords,words.getWords());
    }

    @Test
    void testGetWordsWithLength(){
        List<String> correctWords = Arrays.asList("Dog","Cat","Ant","Cow");
        words.getWordsWithLength(3);
        assertEquals(correctWords,words.getWords());
    }
}
