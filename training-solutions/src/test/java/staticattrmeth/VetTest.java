package staticattrmeth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    @Test
    void getDogs() {

        Dog dog = new Dog("Rex",2,Species.GERMAN_SHEPHERD);
        Dog dog_2 = new Dog("Bacon",10,Species.BEAGLE);
        Dog dog_3 = new Dog("Charlie",7,Species.MIXTURE);

        Vet vet = new Vet();
        vet.addDog(dog);
        vet.addDog(dog_2);
        vet.addDog(dog_3);

        assertEquals(4,Vet.getCode());
    }
}