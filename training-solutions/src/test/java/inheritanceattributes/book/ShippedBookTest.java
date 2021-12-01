package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippedBookTest {

    @Test
    void testOrder(){
        ShippedBook shippedBook = new ShippedBook("LOTR",1500,1000);
        assertEquals(7000,shippedBook.order(4));
    }

    @Test
    void testPurchase(){
        Book book = new Book("LOTR",1500);
        assertEquals(15000,book.purchase(10));
    }

}