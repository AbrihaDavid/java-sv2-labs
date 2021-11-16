package introexceptionreadfiletestjunit5;

import introexceptionreadfiletestjunit4.Words;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    @Test
    void testWordsWithA() {
        String result = new Words().getFirstWordWithA(Paths.get("training-solutions/src/test/resources/words.txt"));
        assertEquals("Anna", result);
    }

    @Test
    void testWordsWithoutA() {

        String result = new Words().getFirstWordWithA(Paths.get("training-solutions/src/test/resources/wordsWithoutA.txt"));
        assertEquals("A", result);
    }
}