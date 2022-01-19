package lamda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TreeNurseryTest {

    TreeNursery treeNursery = new TreeNursery(
            new ArrayList<>(Arrays.asList(
                    new Sapling("A",200),
                    new Sapling("B",500),
                    new Sapling("C",100),
                    new Sapling("D",1000),
                    new Sapling("E",700)
            ))
    );

    @Test
    void prune() {
        treeNursery.prune(500);
        assertEquals(500,treeNursery.getSaplings().get(3).getHeight());
    }

    @Test
    void sell() {
        treeNursery.sell("A",300);
        treeNursery.sell("B",300);
        assertEquals(4,treeNursery.getSaplings().size());
    }
}