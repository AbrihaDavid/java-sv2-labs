package controlselection.consonant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToConsonantTest {

    ToConsonant toConsonant;

    @BeforeEach
    void init(){
        toConsonant = new ToConsonant();
    }

    @Test
    void testNextConsonant(){
        assertEquals('b',toConsonant.getNextConsonant('a'));
        assertEquals('c',toConsonant.getNextConsonant('c'));
        assertEquals('F',toConsonant.getNextConsonant('E'));
    }
}
