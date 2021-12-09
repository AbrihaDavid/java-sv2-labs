package interfacestaticmethods.schoolchild;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolChildTest {

    @Test
    void testLower(){
        PrimarySchoolChild primarySchoolChild = PrimarySchoolChild.of(10);
        assertEquals(LowerClassSchoolChild.class,primarySchoolChild.getClass());
    }

    @Test
    void testUpper(){
        PrimarySchoolChild primarySchoolChild = PrimarySchoolChild.of(13);
        assertEquals(UpperClassSchoolChild.class,primarySchoolChild.getClass());
    }

    @Test
    void testError(){
        assertThrows(IllegalArgumentException.class, ()-> PrimarySchoolChild.of(30));
    }

}