package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void getMinTest() {

        List<Integer> integers = Arrays.asList(10,20,30,40,20,10,5,40);

        assertEquals(5,new Temperature().getMin(integers));
    }
}