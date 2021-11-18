package algorithmssum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {

    @Test
    void sumSalesAmountTest() {

        assertEquals(250,new SalesAmountSumCalculator().sumSalesAmount(Arrays.asList(new Salesperson("David",200),new Salesperson("Jack",50))));
    }
}