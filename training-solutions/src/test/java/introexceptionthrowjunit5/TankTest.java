package introexceptionthrowjunit5;

import introexceptionthrowjunit4.Tank;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {

    @Test
    void testAngle() {
        new Tank().modifyAngle(40);
    }

    @Test
    void testWrongAngle(){
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> new introexceptionthrowjunit5.Tank().modifyAngle(100));
        assertEquals("The barrel can not turn more than 80 degrees in either way.",illegalArgumentException.getMessage());
    }
}
