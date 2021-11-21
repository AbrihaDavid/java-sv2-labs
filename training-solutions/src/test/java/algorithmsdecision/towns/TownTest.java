package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void containsFewerHabitants() {

        List<Integer> habitantList = Arrays.asList(4000,1000,90000,8000000,500,600);

        assertTrue(new Town().containsFewerHabitants(habitantList,700));
        assertFalse(new Town().containsFewerHabitants(habitantList,100));
    }
}