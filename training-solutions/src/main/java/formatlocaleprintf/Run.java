package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {

    private String name;
    private List<Double> kms;

    public Run(String name, List<Double> kms) {
        this.name = name;
        this.kms = kms;
    }

    public String getName() {
        return name;
    }

    public List<Double> getKms() {
        return kms;
    }

    public void addRun (double km){
        kms.add(km);
    }

    public void printFormattedRunText(){
        LocalDate localDate = LocalDate.now();
        String s = String.format("Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d futásod.",getName(),localDate.toString(),kms.size());
        System.out.println(s);
        String s2 = String.format("Most %.2f km-t futottál. Csak így tovább!",getKms().get(kms.size()-1));
        System.out.println(s2);
    }

    public static void main(String[] args) {

        List<Double> kms = new ArrayList<>(Arrays.asList(14.5,12.4,5.5));
        Run run = new Run("Laci",kms);
        run.addRun(10.35);
        run.addRun(5);
        run.printFormattedRunText();
    }
}
