package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    @Test
    public void testAddRightNote() {
        Student student = new Student();
        student.addNote(4);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAddWrongNote() {
        new Student().addNote(8);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testAddWrongNoteRule(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Note must be between 1 and 5!");
        new Student().addNote(7);
    }

    @Test
    public void testAddWrongNoteAssertThrows(){
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> new Student().addNote(7));
        assertEquals("Note must be between 1 and 5!", illegalArgumentException.getMessage());
    }
}
