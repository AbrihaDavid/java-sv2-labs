package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public String areEqual (Student student, Student anotherStudent){
        if (student.getNeptun().equals(anotherStudent.getNeptun()) && student.getEduID().equals(anotherStudent.getEduID())){
            return "The two students are the same";
        } else {
            return "The two students are not the same";
        }
    }
}
