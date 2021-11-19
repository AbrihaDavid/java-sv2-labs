package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    @Test
    void selectSalesPersonWithMaxSalesAmountTest() {
        List<Salesperson> sales = Arrays.asList(
                new Salesperson("Jack",1000,500),
                new Salesperson("Bob",5000,4000),
                new Salesperson("Jill",100,4000),
                new Salesperson("Tom",500,800)
        );
        assertEquals(sales.get(1),new Sales().selectSalesPersonWithMaxSalesAmount(sales));
    }

    @Test
    void selectSalesPersonWithFurthestAboveTargetTest() {
        List<Salesperson> sales = Arrays.asList(
                new Salesperson("Jack",1000,500),
                new Salesperson("Bob",5000,4000),
                new Salesperson("Jill",100,4000),
                new Salesperson("Tom",500,800)
        );
        assertEquals(sales.get(1),new Sales().selectSalesPersonWithFurthestAboveTarget(sales));
    }

    @Test
    void selectSalesPersonWithFurthestBelowTargetTest() {
        List<Salesperson> sales = Arrays.asList(
                new Salesperson("Jack",1000,500),
                new Salesperson("Bob",5000,4000),
                new Salesperson("Jill",100,4000),
                new Salesperson("Tom",500,800)
        );
        assertEquals(sales.get(2), new Sales().selectSalesPersonWithFurthestBelowTarget(sales));
    }
}