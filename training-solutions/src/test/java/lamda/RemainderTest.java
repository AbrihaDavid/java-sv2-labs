package lamda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {

    @Test
    void changeNumbersToRemainders() {

        Remainder remainder = new Remainder();
        List<Integer> result = remainder.changeNumbersToRemainders(new ArrayList<>(Arrays.asList(45,13,64,51,92,33)),3);
        assertEquals(2,result.get(4));
    }
}