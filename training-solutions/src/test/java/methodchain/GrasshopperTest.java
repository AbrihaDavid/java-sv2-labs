package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    Grasshopper grasshopper = new Grasshopper();

    @Test
    void hopOnce(){
        assertEquals(-2,grasshopper.hopOnce(Direction.NEGATIVE).hopOnce(Direction.NEGATIVE).getPosition());
    }

    @Test
    void moveFromZeroToThreeWithFiveHops() {

        grasshopper.moveFromZeroToThreeWithFiveHops();
        assertEquals(3,grasshopper.getPosition());
    }
}