package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    @Test
    void isSuitableWithValidData() {

        ClassRoom classRoom = new ClassRoom("Debrecen",30,Facility.COMPUTERS);
        Course course = new Course(25,Facility.COMPUTERS);
        assertTrue(classRoom.isSuitable(course));
    }

    @Test
    void isSuitableWithInvalidData(){
        ClassRoom classRoom = new ClassRoom("Debrecen",30,Facility.COMPUTERS);
        Course course = new Course(45,Facility.COMPUTERS);

        assertFalse(classRoom.isSuitable(course));
    }
}