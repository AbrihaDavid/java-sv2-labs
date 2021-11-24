package methodparam.sum;

import java.util.ArrayList;
import java.util.List;

public class NumberList {

    private List<Double> positiveNumbers = new ArrayList<>();
    private List<Double> negativeNumbers = new ArrayList<>();

    public void addPositiveNumberToList(Double num){
        positiveNumbers.add(num);
    }

    public void addNegativeNumberToList(Double num){
        negativeNumbers.add(num);
    }

    public List<Double> getPositiveNumbers() {
        return positiveNumbers;
    }

    public List<Double> getNegativeNumbers() {
        return negativeNumbers;
    }
}
