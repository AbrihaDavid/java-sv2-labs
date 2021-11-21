package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolTest {

    @Test
    void getStudents() {

        List<Person> personList = Arrays.asList(
                new Person("Jack",12,"Debrecen"),
                new Person("Bob",10,"Debrecen"),
                new Person("Tom",66,"Budapest"),
                new Person("Jill",9,"Hejőpapi")
        );

        assertEquals(3,new PrimarySchool(personList).getStudents().size());
        assertEquals("Jack",new PrimarySchool(personList).getStudents().get(0).getName());
    }
}