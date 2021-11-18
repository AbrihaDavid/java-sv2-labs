package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void getNumberOfStudentsTest() {

        assertEquals(20,new School().getNumberOfStudents(Arrays.asList(10,5,2,3)));
    }
}