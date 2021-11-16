package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Paths;

import static org.junit.Assert.*;

public class WordsTest {

    @Test
    public void testWordsWithA(){

        String result = new Words().getFirstWordWithA(Paths.get("training-solutions/src/test/resources/words.txt"));
        assertEquals("Anna",result);
    }

    @Test
    public void testWordsWithoutA(){

        String result = new Words().getFirstWordWithA(Paths.get("training-solutions/src/test/resources/wordsWithoutA.txt"));
        assertEquals("A",result);

    }

}