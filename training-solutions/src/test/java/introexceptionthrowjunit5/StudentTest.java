package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    @Test
    void testNote(){
        new Student().addNote(2);
    }

    @Test
    void testWrongNote(){
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> new Student().addNote(7));
        assertEquals("Note must be between 1 and 5!",illegalArgumentException.getMessage());
    }
}
