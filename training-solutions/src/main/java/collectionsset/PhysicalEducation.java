package collectionsset;

import java.util.*;

public class PhysicalEducation {

    public Set<Integer> getOrderInLessons(List<Student> studentList){

        Set<Integer> heightOrder = new TreeSet<>();
        for (Student s: studentList){
            heightOrder.add(s.getHeight());
        }

        return heightOrder;
    }

    public static void main(String[] args) {

        PhysicalEducation physicalEducation = new PhysicalEducation();
        System.out.println(physicalEducation.getOrderInLessons(new ArrayList<>(Arrays.asList(
                new Student("John",180),
                new Student("Jane",170),
                new Student("Jack",190),
                new Student("Bob",165),
                new Student("Barbara",171)
        ))));
    }
}
