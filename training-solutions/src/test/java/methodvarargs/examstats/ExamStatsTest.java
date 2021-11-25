package methodvarargs.examstats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

    ExamStats examStats = new ExamStats(100);

    @Test
    void getNumberOfTopGrades() {
        int numOfTop = examStats.getNumberOfTopGrades(50,10,30,100,80,90);
        assertEquals(3,numOfTop);
    }

    @Test
    void hasAnyFailed() {
        assertTrue(examStats.hasAnyFailed(50,10,30,100,80,90));
        assertFalse(examStats.hasAnyFailed(50,100,60,100,80,90));
    }

    @Test
    void emptyList(){
        assertThrows(IllegalArgumentException.class, ()-> examStats.getNumberOfTopGrades(50));
    }
}