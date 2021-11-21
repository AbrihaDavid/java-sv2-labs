package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void containsLongerWord() {

        List<String> wordList = Arrays.asList("Dog","Cat","Plane","Testword","Verylongword");

        assertTrue(new Word().containsLongerWord(wordList,"Computer"));
        assertFalse(new Word().containsLongerWord(wordList,"Anevenlongerword"));
    }
}