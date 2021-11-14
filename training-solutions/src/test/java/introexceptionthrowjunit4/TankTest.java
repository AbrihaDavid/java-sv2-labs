package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {

    @Test
    public void testAngle() {
        new Tank().modifyAngle(40);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrongAngle() {
        new Tank().modifyAngle(100);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testAddWrongAngleRule() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("The barrel can not turn more than 80 degrees in either way.");
        new Tank().modifyAngle(100);
    }

    @Test
    public void testAddWrongRuleAssertThrows(){
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> new Tank().modifyAngle(100));
        assertEquals("The barrel can not turn more than 80 degrees in either way.", illegalArgumentException.getMessage());
    }

}

