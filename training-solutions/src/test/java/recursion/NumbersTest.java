package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void getSum() {

        int[] a = new int[]{10,20,50};

        assertEquals(80, new Numbers().getSum(a));
    }
}