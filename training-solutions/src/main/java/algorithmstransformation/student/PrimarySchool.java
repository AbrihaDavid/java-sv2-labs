package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {

    private List<Person> personList = new ArrayList<>();

    public PrimarySchool(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void addPerson (Person person){
        personList.add(person);
    }

    public List<Student> getStudents(){

        List<Student> listOfStudents = new ArrayList<>();
        for (Person person: personList){
            if (person.getAge() <= 18){
                listOfStudents.add(new Student(person.getName(), person.getAddress())
                );
            }
        }
        return listOfStudents;
    }
}
