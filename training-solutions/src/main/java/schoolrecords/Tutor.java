package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> subjectList = new ArrayList<>();

    public Tutor(String name, List<Subject> subjectList) {
        this.name = name;
        this.subjectList = subjectList;
    }

    public boolean tutorTeachingSubject(Subject subject){
        boolean teaches = false;

        for (Subject s: subjectList){
            if (s.getSubjectName().equals(subject.getSubjectName())){
                teaches = true;
            }
        }

        return teaches;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }
}
