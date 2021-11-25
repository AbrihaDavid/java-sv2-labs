package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    Time time = new Time(10,20,30);

    @Test
    void isEqualWithTimeObject() {
        assertTrue(time.isEqual(new Time(10,20,30)));
    }

    @Test
    void isEqualWithHMS() {
        assertTrue(time.isEqual(10,20,30));
    }

    @Test
    void isEarlierWithTimeObject() {
        assertTrue(time.isEarlier(new Time(10,20,31)));
        assertTrue(time.isEarlier(new Time(11,20,30)));
    }

    @Test
    void isEarlierWithHMS() {
        assertTrue(time.isEarlier(15,20,10));
        assertFalse(time.isEarlier(9,10,2));
    }
}