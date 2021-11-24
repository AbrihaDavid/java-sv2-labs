package methodparam.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void sum() {

        SeparatedSum separatedSum = new SeparatedSum();
        String floatingNumbers = separatedSum.makeStringOfList();

        assertEquals(-153.3, separatedSum.sum(floatingNumbers).getSumOfNegativeNumbers());
    }
}