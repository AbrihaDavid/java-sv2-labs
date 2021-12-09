package interfacestaticmethods.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testBike(){
        assertEquals(Bicycle.class,Vehicle.of(2).getClass());
    }

    @Test
    void testCar(){
        assertEquals(Car.class,Vehicle.of(4).getClass());
    }

    @Test
    void testInvalid(){
        assertThrows(IllegalArgumentException.class,()-> Vehicle.of(100));
    }

}