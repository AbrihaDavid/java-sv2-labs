package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StudentTest {

    // JUNIT 4.12 van csak az IDEA-ba, ÉS AZ ASSERTTHROWS A 4.13-TÓL VAN AHOGY NÉZTEM

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
}
