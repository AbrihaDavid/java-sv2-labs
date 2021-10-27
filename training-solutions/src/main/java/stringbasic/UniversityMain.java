package stringbasic;

public class UniversityMain {

    public static void main(String[] args) {

        University university = new University();
        Person personOne = new Person("David","david@gmail.com","9124214","1172425-2352353","0620453252");
        Person personTwo = new Person("Jack","Jack@gmail.com","735737","1172425-74824882","0630999212");
        Student studentOne = new Student(personOne,"KK1020","123456");
        Student studentTwo = new Student(personTwo,"KK1020","123456");

        university.addStudent(studentOne);
        university.addStudent(studentTwo);

        System.out.println(university.areEqual(studentOne,studentTwo));
        studentOne.setEduID("1234");
        System.out.println(university.areEqual(studentOne,studentTwo));
    }
}
