package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exam {

    private List<ExamResult> examResults = new ArrayList<>();

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<ExamResult> getExamResults() {
        return examResults;
    }

    public List<String> getNamesOfSucceededPeople(int places){
        List<String> result = new ArrayList<>();
        Collections.sort(examResults, new Comparator<ExamResult>() {
            @Override
            public int compare(ExamResult o1, ExamResult o2) {
                return o1.getPoint() - o2.getPoint();
            }
        });
        Collections.reverse(examResults);
        if (places > examResults.size()){
            for (ExamResult e: examResults){
                result.add(e.getName());
            }
            return result;
        }
        examResults = examResults.stream().limit(places).collect(Collectors.toList());
        for (ExamResult e: examResults){
            result.add(e.getName());
        }
        return result;
    }
}
