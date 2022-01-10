package collectionsiterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasShoppingTest {

    @Test
    void removeTooExpensivePresent() {

        ChristmasShopping christmasShopping = new ChristmasShopping(new ArrayList<>(Arrays.asList(
                new ChristmasPresent("Good present","Jack",1000),
                new ChristmasPresent("Bad present","Joe",400),
                new ChristmasPresent("Best present","Jane",2000),
                new ChristmasPresent("Okay present","Daniel",650)
        )));
        christmasShopping.removeTooExpensivePresent(800);
        assertEquals(2,christmasShopping.getChristmasPresents().size());
    }
}