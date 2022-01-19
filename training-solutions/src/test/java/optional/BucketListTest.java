package optional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BucketListTest {

    BucketList bucketList = new BucketList(new ArrayList<>(Arrays.asList(
            new Destination("Germany","Good beer",500),
            new Destination("USA","Great Lakes",6000),
            new Destination("Australia","Australian Open",15000)
    )));

    @Test
    void getDestinationWithKeyword() {
        assertEquals("Germany",bucketList.getDestinationWithKeyword("many").get().getName());
    }

    @Test
    void getDestinationNearerThanGiven() {
        assertEquals(500,bucketList.getDestinationNearerThanGiven(20000).get().getKmFromHome());
    }
}