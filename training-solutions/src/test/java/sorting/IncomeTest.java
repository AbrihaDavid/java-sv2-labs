package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {

    @Test
    void testGetHighestIncome() {

        assertEquals(7347,new Income().getHighestIncome());
    }
}