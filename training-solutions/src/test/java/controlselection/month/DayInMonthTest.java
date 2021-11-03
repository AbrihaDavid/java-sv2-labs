package controlselection.month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayInMonthTest {


    DayInMonth dayInMonth;

    @BeforeEach
    void init() {
        dayInMonth = new DayInMonth();
    }

    @Test
    void testGreetings() {
        assertEquals(29, dayInMonth.numberOfDayInMonth(2024, "február"));
        assertEquals(28, dayInMonth.numberOfDayInMonth(2023, "FEBruáR"));
        assertEquals(31, dayInMonth.numberOfDayInMonth(2023, "JÚLIUS"));
        assertEquals(0, dayInMonth.numberOfDayInMonth(2023, "tegnapelőtt"));
    }
}
