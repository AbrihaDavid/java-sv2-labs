package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TankTest {

    // JUNIT 4.12 van csak az IDEA-ba, ÉS AZ ASSERTTHROWS A 4.13-TÓL VAN AHOGY NÉZTEM

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
}

