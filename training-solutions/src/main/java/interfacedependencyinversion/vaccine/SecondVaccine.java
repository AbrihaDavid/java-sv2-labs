package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();


    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {

        List<Person> pregnantAndChronicPeople = new ArrayList<>();
        for (Person person: registrated){
            if (person.getPregnant() == Pregnancy.YES || person.getChronic() == ChronicDisease.YES){
                pregnantAndChronicPeople.add(person);
            }
        }
        registrated.removeAll(pregnantAndChronicPeople);
        List<Person> youngPeople = new ArrayList<>();
        for (Person person: registrated){
            if (person.getAge() <= 65){
                youngPeople.add(person);
                vaccinationList.add(person);
            }
        }
        registrated.removeAll(youngPeople);
        vaccinationList.addAll(registrated);
    }
}
