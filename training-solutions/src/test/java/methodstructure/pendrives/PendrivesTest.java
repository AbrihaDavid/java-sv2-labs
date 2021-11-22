package methodstructure.pendrives;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PendrivesTest {

    Pendrive pendrive_one = new Pendrive("One",2,1000);
    Pendrive pendrive_two = new Pendrive("Two",16,2000);
    Pendrive pendrive_three = new Pendrive("Three",64,5000);
    Pendrive pendrive_four = new Pendrive("Four",128,8000);

    List<Pendrive> pendriveList = Arrays.asList(
            pendrive_one,
            pendrive_two,
            pendrive_three,
            pendrive_four
    );


    @Test
    void getBest() {

        assertEquals(pendriveList.get(3).getName(), new Pendrives().getBest(pendriveList).getName());
    }

    @Test
    void getCheapest() {

        assertEquals(pendriveList.get(0),new Pendrives().getCheapest(pendriveList));

    }

    @Test
    void risePriceWhereCapacity() {

        new Pendrives().risePriceWhereCapacity(pendriveList,10,128);
        assertEquals(8800, pendriveList.get(3).getPrice());
    }
}