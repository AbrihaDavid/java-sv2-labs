package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void getMaxTest() {

        List<Integer> integers = Arrays.asList(200,4500,600,8800,30,50);

        assertEquals(8800,new Hill().getMax(integers));
    }
}