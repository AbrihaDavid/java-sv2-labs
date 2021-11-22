package methodstructure.bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {

    @Test
    void isThinnerThan() {

        BodyMass bodyMass = new BodyMass(60,190);
        BodyMass bodyMass_other = new BodyMass(100,190);

        assertTrue(bodyMass.isThinnerThan(bodyMass_other));
    }
}