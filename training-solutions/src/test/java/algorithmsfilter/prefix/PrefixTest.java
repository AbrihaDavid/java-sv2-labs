package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void getWordsStartWith() {

        List<String> wordList = Arrays.asList("Dog","Cat","Cow","Calcium","Parrot");

        assertEquals(2, new Prefix().getWordsStartWith(wordList,"Ca").size());
        assertEquals("Cat", new Prefix().getWordsStartWith(wordList,"Ca").get(0));
        assertFalse(new Prefix().getWordsStartWith(wordList,"Ca").contains("Parrot"));
    }
}