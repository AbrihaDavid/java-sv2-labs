package collectionslist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class BunchOfFlowersTest {

    @Test
    void testWithEven(){
        BunchOfFlowers bunchOfFlowers = new BunchOfFlowers(new LinkedList<>(Arrays.asList(
                "Rose",
                "Sunflower",
                "Marigold",
                "Cosmos"
        )));
        bunchOfFlowers.addFlowerInTheMiddle("Daffodil");
        assertEquals("Daffodil",bunchOfFlowers.getFlowerList().get(2));
    }

    @Test
    void testWithOdd(){
        BunchOfFlowers bunchOfFlowers = new BunchOfFlowers(new LinkedList<>(Arrays.asList(
                "Rose",
                "Sunflower",
                "Marigold",
                "Cosmos",
                "Daffodil"
        )));
        bunchOfFlowers.addFlowerInTheMiddle("Lavender");
        assertEquals("Lavender",bunchOfFlowers.getFlowerList().get(2));
        assertEquals("Lavender",bunchOfFlowers.getFlowerList().get(4));
    }
}