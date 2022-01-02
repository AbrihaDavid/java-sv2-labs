package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Student {

    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (name.isEmpty()){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void grading(Mark mark){
        if (mark == null){
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage(){
        if (marks.isEmpty()){
            return 0.0;
        }
        double sum = 0.0;
        for (Mark m: marks){
            sum += m.getMarkType().getMark();
        }
        double avg = sum/marks.size();
        return Double.parseDouble(String.format(Locale.US,"%.2f",avg));
    }

    public double calculateSubjectAverage(Subject subject){
        if (marks.isEmpty()){
            return 0.0;
        }
        double sum = 0.0;
        int numOfMarksWithGivenSubject = 0;
        for (Mark m: marks){
            if (m.getSubject().getSubjectName() == subject.getSubjectName()){
                sum += m.getMarkType().getMark();
                numOfMarksWithGivenSubject ++;
            }
        }
        if (numOfMarksWithGivenSubject == 0){
            return 0.0;
        }
        double avg = sum/numOfMarksWithGivenSubject;
        return Double.parseDouble(String.format(Locale.US,"%.2f",avg));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name);
        for (Mark m: marks){
            sb.append(" marks: ").append(m.getSubject().getSubjectName()).append(": ").append(m.getMarkType().getNameOfMark()).append("(").append(m.getMarkType().getMark()).append(")");
        }
        return sb.toString();
    }
}
