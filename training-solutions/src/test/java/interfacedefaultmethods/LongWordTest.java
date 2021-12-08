package interfacedefaultmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void testGetLongWord() {

        LongWord longWord = new LongWord();
        assertEquals("LONGWORD",longWord.getLongWord());
    }
}