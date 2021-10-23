package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {

        List<Student> listOfStudents = new ArrayList<>();
        Student studentOne = new Student("Jack");
        Student studentTwo = new Student("Joe");
        Student studentThree = new Student("Tom");
        Student studentFour = new Student("Bob");
        listOfStudents.add(studentOne);
        listOfStudents.add(studentTwo);
        listOfStudents.add(studentThree);
        listOfStudents.add(studentFour);

        listOfStudents.get(0).setActive(false);
        listOfStudents.get(3).setActive(false);
        listOfStudents.get(2).setActive(false);

        List<Student> studentsToRemove = new ArrayList<>();
        for (int i = 0; i<listOfStudents.size();i++){
            if (!listOfStudents.get(i).isActive()){
                studentsToRemove.add(listOfStudents.get(i));
            }
        }

        System.out.println(listOfStudents.size());
        listOfStudents.removeAll(studentsToRemove);
        System.out.println(listOfStudents.size());
    }
}
