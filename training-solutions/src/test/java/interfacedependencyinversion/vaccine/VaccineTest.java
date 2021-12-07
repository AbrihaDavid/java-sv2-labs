package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VaccineTest {

    Vaccine vaccine;
    List<Person> personList = new ArrayList<>();

    @BeforeEach
    void init(){
        personList.add(new Person("Jack",20,ChronicDisease.NO,Pregnancy.NO));
        personList.add(new Person("Joe",80,ChronicDisease.YES,Pregnancy.NO));
        personList.add(new Person("Bill",75,ChronicDisease.NO,Pregnancy.NO));
        personList.add(new Person("Jane",30,ChronicDisease.NO,Pregnancy.YES));
        personList.add(new Person("Jill",22,ChronicDisease.NO,Pregnancy.YES));
        personList.add(new Person("Rose",20,ChronicDisease.YES,Pregnancy.NO));
    }

    @Test
    void testFirstVaccine(){
        FirstVaccine firstVaccine = new FirstVaccine();
        firstVaccine.generateVaccinationList(personList);

        assertEquals("Jane",firstVaccine.getVaccinationList().get(0).getName());
        assertEquals(22,firstVaccine.getVaccinationList().get(1).getAge());
        assertEquals(80,firstVaccine.getVaccinationList().get(2).getAge());
    }

    @Test
    void testSecondVaccine(){
        SecondVaccine secondVaccine = new SecondVaccine();
        secondVaccine.generateVaccinationList(personList);

        assertEquals("Jack",secondVaccine.getVaccinationList().get(0).getName());
        assertEquals("Bill",secondVaccine.getVaccinationList().get(1).getName());
        assertEquals(2,secondVaccine.getVaccinationList().size());
    }

}