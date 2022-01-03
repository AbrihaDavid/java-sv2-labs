package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    NumbersSum numbersSum = new NumbersSum();

    @Test
    void testWithIntArray(){
        int [] nums = {5,5};
        assertEquals(10,numbersSum.getSum(nums));
    }

    @Test
    void testIntArrayIfNull(){
        int [] nums = null;
        assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(nums));
    }

    @Test
    void testStringArray(){
        String [] nums = {"5","5"};
        assertEquals(10,numbersSum.getSum(nums));
    }

    @Test
    void testStringArrayIfNull(){
        String [] nums = null;
        assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(nums));
    }

    @Test
    void testStringWithWrongNumbers(){
        String [] nums = {"1","asd"};
        assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(nums));
    }
}