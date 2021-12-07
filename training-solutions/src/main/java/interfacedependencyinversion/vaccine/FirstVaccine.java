package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        List<Person> pregnantPeople = new ArrayList<>();
        for (Person person: registrated){
            if (person.getPregnant() == Pregnancy.YES){
                vaccinationList.add(person);
                pregnantPeople.add(person);
            }
        }
        registrated.removeAll(pregnantPeople);

        List<Person> oldPeople = new ArrayList<>();
        for (Person person: registrated){
            if (person.getAge() > 65){
                vaccinationList.add(person);
                oldPeople.add(person);
            }
        }
        registrated.removeAll(oldPeople);
        vaccinationList.addAll(registrated);
    }
}
