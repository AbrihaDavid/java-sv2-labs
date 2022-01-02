package schoolrecords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random random;
    private List<Student> studentList = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public Random getRandom() {
        return random;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public boolean addStudent(Student student) {
        for (Student s : studentList) {
            if (s.getName().equals(student.getName())) {
                return false;
            }
        }
        studentList.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        for (Student s : studentList) {
            if (s.getName().equals(student.getName())) {
                studentList.remove(s);
                return true;
            }
        }
        return false;
    }

    public double calculateClassAverage() {
        if (studentList.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double sum = 0.0;
        for (Student s : studentList) {
            if (s.getMarks().isEmpty()) {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
            sum += s.calculateAverage();
        }
        return sum / studentList.size();
    }

    public double calculateClassAverageBySubject(Subject subject) {
        if (studentList.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double sum = 0.0;
        int numOfStudentsWithSubjectmark = 0;
        for (Student s : studentList) {
            if (s.toString().contains(subject.getSubjectName())) {
                sum += s.calculateSubjectAverage(subject);
                numOfStudentsWithSubjectmark++;
            }
        }
        return sum / numOfStudentsWithSubjectmark;
    }

    public Student findStudentByName(String name){
        if (name.isEmpty()){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (studentList.isEmpty()){
            throw new IllegalStateException("No students to search!");
        }
        for (Student s: studentList){
            if (s.getName().equals(name)){
                return s;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition(){
        if (studentList.isEmpty()){
            throw new IllegalStateException("No students to select for repetition!");
        }
        return studentList.get(random.nextInt(studentList.size()));
    }

    public List<StudyResultByName> listStudyResults(){
        List<StudyResultByName> result = new ArrayList<>();
        for (Student s : studentList) {
            result.add(new StudyResultByName(s.getName(), s.calculateAverage()));
        }
        return result;
    }

    public String listStudentNames() {
        List<String> names = new ArrayList<>();
        for (Student s : studentList) {
            names.add(s.getName());
        }
        return String.join(", ", names);
    }
}



