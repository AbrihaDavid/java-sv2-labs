package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    ClassFiveA classFiveA = new ClassFiveA();

    @Test
    void getTodayReferringStudentByInt() {
        assertEquals("John",classFiveA.getTodayReferringStudent(1));
    }

    @Test
    void getTodayReferringStudentByEnum() {
        assertEquals("Jill",classFiveA.getTodayReferringStudent(Number.THREE));
    }

    @Test
    void getTodayReferringStudentByString() {
        assertEquals("Jane",classFiveA.getTodayReferringStudent("four"));
    }
}