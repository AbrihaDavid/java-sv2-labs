package interfaces.animal;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    Zoo zoo = new Zoo(new ArrayList<>(Arrays.asList(
            new Duck(),
            new Lion(),
            new Worm()
    )));

    @Test
    void testNumofAnimals(){

        assertEquals(3,zoo.getNumberOfAnimals());
    }

    @Test
    void testNumOfLegs(){

        assertEquals(6,zoo.getNumberOfAllLegs());
    }

}