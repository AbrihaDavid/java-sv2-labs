package controladvanced.labels;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabelsTest {

    Labels labels;

    @BeforeEach
    void init(){
        labels = new Labels();
    }

    @Test
    void testGetTableOfNumbers(){
        int [][] table = labels.getTableOfNumbers(6);
        assertEquals(11,table[4][5]);
    }
}
