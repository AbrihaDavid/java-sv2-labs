package collectionsmap;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ClassTripTest {

    @Test
    void testLoad(){
        ClassTrip classTrip = new ClassTrip();
        classTrip.loadInpayments(Paths.get("inpayments.txt"));

        assertEquals(5000,classTrip.getMoney().get("Nagy Béla"));
        assertTrue(classTrip.getMoney().containsValue(15000));
    }

}