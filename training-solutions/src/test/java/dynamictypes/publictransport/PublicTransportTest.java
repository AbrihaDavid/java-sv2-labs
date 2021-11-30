package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testAddingVehiclesToList(){
        PublicVehicle bus = new Bus(12345,10,"IKARUS");
        PublicVehicle tram = new Tram(12345,10,2);
        PublicVehicle metro = new Metro(12345,10,8);

        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3,publicTransport.getPublicVehicles().size());
    }

}