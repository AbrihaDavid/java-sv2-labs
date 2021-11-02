package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {

    @Test
    void testName(){
        Dragon dragon = new Dragon("Smaug",1,500);
        assertEquals("Smaug",dragon.getName());
        assertNotEquals("Draco",dragon.getName());
    }

    @Test
    void testNumberOfHeads(){
        Dragon dragon = new Dragon("Smaug",1,500);
        assertEquals(1,dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 1);
        assertFalse(dragon.getNumberOfHeads() == 2);
    }

    @Test
    void testHeight(){
        Dragon dragon = new Dragon("Smaug",1,500);
        assertEquals(500,dragon.getHeight());
    }

    @Test
    void testNull(){
        Dragon dragon = new Dragon("Smaug",1,500);
        Dragon anotherDragon = new Dragon(null,3,1000);
        assertNull(anotherDragon.getName());
        assertNotNull(dragon.getName());
    }

    @Test
    void testSameObjects(){
        Dragon dragon = new Dragon("Smaug",1,500);
        Dragon anotherDragon = dragon;
        assertSame(dragon,anotherDragon);
    }

    @Test
    void testNotSameObjects(){
        Dragon dragon = new Dragon("Smaug",1,500);
        Dragon anotherDragon = new Dragon("Smaug",1,500);
        assertNotSame(dragon,anotherDragon);
    }
}
