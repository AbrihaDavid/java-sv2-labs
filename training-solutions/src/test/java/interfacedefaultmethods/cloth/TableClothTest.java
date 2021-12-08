package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    TableCloth tableCloth = new TableCloth(10);

    @Test
    void testNumberOfSides(){
        assertEquals(4,tableCloth.getNumberOfSides());
    }

    @Test
    void testLengthOfDiagonal(){
        assertEquals(14.14,tableCloth.getLengthOfDiagonal(),0.005);
    }

    @Test
    void testPerimeter(){
        assertEquals(40,tableCloth.getPerimeter());
    }

    @Test
    void testArea(){
        assertEquals(100,tableCloth.getArea());
    }

}