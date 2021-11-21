package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    @Test
    void getFirstTwoLetters() {

        List<String> wordList = Arrays.asList("Dog","Cat","Parrot","Whale");

        assertEquals("Pa",new TwoLetters().getFirstTwoLetters(wordList).get(2));
    }
}