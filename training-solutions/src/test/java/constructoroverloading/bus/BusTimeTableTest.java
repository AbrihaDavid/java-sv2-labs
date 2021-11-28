package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTimeTableTest {

    BusTimeTable busTimeTable = new BusTimeTable(10,20,30);

    @Test
    void getNextBus() {

        assertEquals(new SimpleTime(15,30).getTime(),busTimeTable.getNextBus(new SimpleTime(14,40)).getTime());
    }

    @Test
    void getNextBusIfTooLate(){
        assertThrows(IllegalStateException.class, ()-> busTimeTable.getNextBus(new SimpleTime(20,31)));
    }
}