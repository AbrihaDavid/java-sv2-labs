package controlselection.week;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeeksTest {

    DayOfWeeks dayOfWeeks;

    @BeforeEach
    void init(){
        dayOfWeeks = new DayOfWeeks();
    }

    @Test
    void testStatusOfWeek(){
        assertEquals("hét eleje van", dayOfWeeks.statusOfWeek("hétfő"));
        assertEquals("hét vége van", dayOfWeeks.statusOfWeek("szombat"));
        assertEquals("ismeretlen nap", dayOfWeeks.statusOfWeek("tegnap"));
    }
}
