package objectclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBagTest {

    @Test
    void testSimpleBag(){
        Beer beer = new Beer("Beer",1000);
        Book book = new Book("Author","Title");
        SimpleBag simpleBag = new SimpleBag();
        simpleBag.putItem(beer);
        simpleBag.putItem(book);

        assertTrue(simpleBag.contains(beer));
        assertFalse(simpleBag.isEmpty());
    }

}