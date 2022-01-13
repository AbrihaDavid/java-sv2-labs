package collectionsclass;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    Exam exam = new Exam(new ArrayList<>(Arrays.asList(
            new ExamResult("Joe",10),
            new ExamResult("Bob",50),
            new ExamResult("Jack",35),
            new ExamResult("Jane",48),
            new ExamResult("Jill",87)
    )));

    @Test
    void getNamesOfSucceededPeople() {
        assertEquals("Jill",exam.getNamesOfSucceededPeople(3).get(0));
    }

    @Test
    void getNameOfSucceededPeopleIfMorePlaces(){
        assertEquals(5,exam.getNamesOfSucceededPeople(10).size());
    }
}