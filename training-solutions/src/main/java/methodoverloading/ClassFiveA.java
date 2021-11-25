package methodoverloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassFiveA {

    private List<String> nameOfStudents = new ArrayList<>(Arrays.asList("John","Jack","Jill","Jane"));

    public String getTodayReferringStudent(int number){
        return nameOfStudents.get(number-1);
    }

    public String getTodayReferringStudent(Number number){
        return nameOfStudents.get(number.getValue()-1);
    }

    public String getTodayReferringStudent(String numberName){
        return nameOfStudents.get(Number.valueOf(numberName.toUpperCase()).getValue()-1);
    }
}
