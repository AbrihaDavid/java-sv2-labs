package clone.timesheet;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TimeSheetItemTest {

    @Test
    void copyWithDifferentEmployee() {

        TimeSheetItem timeSheetItem = new TimeSheetItem("Jack","Important project", LocalDateTime.of(2022,1,5,8,0),LocalDateTime.of(2022,1,5,16,0));
        assertEquals("Joe",timeSheetItem.copyWithDifferentEmployee(timeSheetItem,"Joe").getEmployee());
        assertEquals("Important project",timeSheetItem.copyWithDifferentEmployee(timeSheetItem,"Joe").getProject());

    }
}