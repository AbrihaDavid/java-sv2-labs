package collectionsmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CastingTest {

    @Test
    void callNextApplicantTest() {
        Casting casting = new Casting();
        Map<Integer,String> applicants = new HashMap<>();
        applicants.put(10,"Bob");
        applicants.put(30,"Tom");
        applicants.put(40,"Jack");
        applicants.put(28,"Katie");
        applicants.put(76,"Jane");

        assertEquals("Katie",casting.callNextApplicant(26,applicants));
    }
}