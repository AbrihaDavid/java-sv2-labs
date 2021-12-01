package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigBossTest {

    @Test
    void testSalary(){
        BigBoss bigBoss = new BigBoss("John Doe","Debrecen",50000,100,50000);
        assertEquals(600000,bigBoss.getSalary());
    }

}