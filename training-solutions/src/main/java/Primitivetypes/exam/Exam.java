package Primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    List<Person> appliedForExam = new ArrayList<>();

    public List<Person> getAppliedForExam() {
        return appliedForExam;
    }

    public void addPerson(Person person){
        appliedForExam.add(person);
    }
}
