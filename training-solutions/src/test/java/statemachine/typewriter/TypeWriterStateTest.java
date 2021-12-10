package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    void testChangeToUpper(){
        TypeWriterState typeWriterState = TypeWriterState.LOWER;
        assertEquals(TypeWriterState.UPPER,typeWriterState.next());
    }

    @Test
    void testChangeToLower(){
        TypeWriterState typeWriterState = TypeWriterState.UPPER;
        assertEquals(TypeWriterState.LOWER,typeWriterState.next());
    }

}