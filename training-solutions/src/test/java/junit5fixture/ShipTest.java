package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {

    Ship ship;

    @BeforeEach
    void init(){
        ship = new Ship("Boat",1999,33.3);
    }

    @Test
    void testName(){
        assertEquals("Boat",ship.getName());
        assertNotEquals("Ship",ship.getName());
    }

    @Test
    void testYearOfConstruction(){
        assertEquals(1999,ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() == 1999);
        assertFalse(ship.getYearOfConstruction() == 2000);
    }

    @Test
    void testLength(){
        assertEquals(33.3,ship.getLength(),0.005);
    }

    @Test
    void testNull(){
        Ship newShip = null;
        assertNull(newShip);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects(){
        Ship newShip = ship;
        assertSame(ship,newShip);
    }

    @Test
    void testNotSameObjects(){
        Ship newShip = new Ship("Boat",1999,33.3);
        assertNotSame(ship,newShip);
    }
}
