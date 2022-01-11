package searching;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {

    @Test
    void searchPike() {

        Mountain mountain = new Mountain(new int[]{200,300,1000});
        assertTrue(mountain.searchPike(new Pike("A",1000)));
    }
}