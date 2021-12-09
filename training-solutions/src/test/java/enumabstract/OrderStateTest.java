package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderStateTest {

    @Test
    void testIfTrue(){
        assertTrue(OrderState.NEW.canDelete());
        assertTrue(OrderState.CONFIRMED.canDelete());
    }

    @Test
    void testIfFalse(){
        assertFalse(OrderState.ONBOARD.canDelete());
        assertFalse(OrderState.RETURNED.canDelete());
    }

}