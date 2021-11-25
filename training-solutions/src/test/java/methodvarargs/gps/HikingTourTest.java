package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {

    @Test
    void logFieldPoints() {

        FieldPoint fp_1 = new FieldPoint(LocalDateTime.now(),47.2332,21.162);
        FieldPoint fp_2 = new FieldPoint(LocalDateTime.now(),47.2345,21.167);
        FieldPoint fp_3 = new FieldPoint(LocalDateTime.now(),47.2352,21.163);

        HikingTour hikingTour =  new HikingTour();

        hikingTour.logFieldPoints(LocalDateTime.now(),fp_1,fp_2,fp_3);

        assertEquals(3,hikingTour.getFieldPoints().size());

    }
}