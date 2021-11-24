package methodparam.sum;

import java.util.List;

public class SumOfNumbers {

    private double sumOfPositiveNumbers;
    private double sumOfNegativeNumbers;

    public SumOfNumbers( List<Double> positiveNumbers, List<Double> negativeNumbers) {
        this.sumOfPositiveNumbers = positiveNumbers.stream().mapToDouble(Double::doubleValue).sum();
        this.sumOfNegativeNumbers = negativeNumbers.stream().mapToDouble(Double::doubleValue).sum();
    }

    public double getSumOfPositiveNumbers() {
        return sumOfPositiveNumbers;
    }

    public double getSumOfNegativeNumbers() {
        return sumOfNegativeNumbers;
    }
}
