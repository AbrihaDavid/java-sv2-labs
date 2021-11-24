package methodparam.sum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SeparatedSum {

    public List<String> readFile(){
        try {
            return Files.readAllLines(Paths.get("training-solutions/src/test/resources/floatingnumbers.txt"));
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read file",ioe);
        }
    }

    public String makeStringOfList(){

        List<String> fileContent = readFile();
        StringBuilder sb = new StringBuilder();

        for(String s: fileContent){
            sb.append(s);
        }
        return sb.toString();
    }

    public SumOfNumbers sum(String floatingNumbers){
        String numbersAsStringWithCorrectSeparator = floatingNumbers.replaceAll(",",".");
        NumberList numberList = new NumberList();

        double[] numbersAsDouble = Arrays.asList(numbersAsStringWithCorrectSeparator.split(";")).stream().mapToDouble(Double::parseDouble).toArray();

        for(int i = 0; i <numbersAsDouble.length;i++){
            if (numbersAsDouble[i] >= 0){
                numberList.addPositiveNumberToList(numbersAsDouble[i]);
            } else {
                numberList.addNegativeNumberToList(numbersAsDouble[i]);
            }
        }

        return new SumOfNumbers(numberList.getPositiveNumbers(),numberList.getNegativeNumbers());
    }
}
