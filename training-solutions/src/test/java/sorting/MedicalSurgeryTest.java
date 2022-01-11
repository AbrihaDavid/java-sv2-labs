package sorting;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MedicalSurgeryTest {

    @Test
    void getPatientsInTimeOrder() {

        MedicalSurgery medicalSurgery = new MedicalSurgery(new ArrayList<>(Arrays.asList(
                new Patient("A","123", LocalDateTime.of(2022,2,10,10,0)),
                new Patient("B","345", LocalDateTime.of(2022,1,4,8,0)),
                new Patient("C","456", LocalDateTime.of(2022,1,2,10,0)),
                new Patient("D","567", LocalDateTime.of(2022,1,30,10,0))
        )));

        medicalSurgery.getPatientsInTimeOrder();
        assertEquals("C",medicalSurgery.getPatientsInTimeOrder().get(0).getName());
    }
}