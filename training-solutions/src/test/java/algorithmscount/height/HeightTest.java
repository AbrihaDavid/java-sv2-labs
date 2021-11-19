package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void countChildrenWithHeightGreaterThanTest() {
        List<Integer> heightList = Arrays.asList(180,200,100,120,80,90,164);

        assertEquals(4,new Height().countChildrenWithHeightGreaterThan(heightList,120));
    }
}