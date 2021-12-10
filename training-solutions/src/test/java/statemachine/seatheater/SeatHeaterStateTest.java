package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    @Test
    void testOff(){
        SeatHeaterState seatHeaterState = SeatHeaterState.OFF;
        assertEquals(SeatHeaterState.STATE_3,seatHeaterState.next());
    }

    @Test
    void testState3(){
        SeatHeaterState seatHeaterState = SeatHeaterState.STATE_1;
        assertEquals(SeatHeaterState.OFF,seatHeaterState.next());
    }

}