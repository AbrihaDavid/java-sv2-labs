package schoolrecords;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class TutorTest {

    @Test
    public void testTutorTeachingSubject() {
        //Given
        Tutor tutor = new Tutor("Nagy Csilla", Arrays.asList(new Subject("matematika"), new Subject("fizika")));
        //Then

        assertEquals("Nagy Csilla", tutor.getName());
        assertTrue(tutor.tutorTeachingSubject(new Subject("fizika")));
    }

    @Test
    public void testTutorDoesNotTeachingSubject() {
        //Given
        Tutor tutor = new Tutor("Nagy Csilla", Arrays.asList(new Subject("matematika"), new Subject("fizika")));
        //Then

        assertFalse(tutor.tutorTeachingSubject(new Subject("biológia")));
    }
}

