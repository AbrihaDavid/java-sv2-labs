package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void getAnimalsWithNumberOfLegsGiven() {

        Animal cat = new Animal("Cat",4);
        Animal dog = new Animal("Dog",4);
        Animal parrot = new Animal("Parrot",2);
        Animal whale = new Animal("Whale",0);

        Zoo zoo = new Zoo(
                new ArrayList<>(Arrays.asList(
                        cat,
                        dog,
                        parrot,
                        whale
                ))
        );
        assertEquals(2,zoo.getAnimalsWithNumberOfLegsGiven(4).size());
    }
}