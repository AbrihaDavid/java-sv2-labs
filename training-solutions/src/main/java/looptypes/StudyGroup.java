package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {

    public void printStudyGroup(List<String> students){
        List<String> groupOne = new ArrayList<>();
        List<String> groupTwo = new ArrayList<>();
        for (String name: students){
            if (name.length() <= 10){
                groupOne.add(name);
            } else {
                groupTwo.add(name);
            }
        }
        System.out.println(groupOne + "\n" + groupTwo);
    }

    public static void main(String[] args) {
        StudyGroup sg = new StudyGroup();
        List<String> students = Arrays.asList("Joe","Jack","Jim","Jimbutlonger","Joebutlonger","Jackbutlonger");
        sg.printStudyGroup(students);
    }
}
