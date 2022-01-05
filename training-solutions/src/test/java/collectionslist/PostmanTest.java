package collectionslist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostmanTest {

    Postman postman = new Postman();
    @Test
    void testAddAddress(){
        postman.addAddress("Debrecen, Egyetem tér 1");
        assertEquals(1,postman.getAddressList().size());
    }

    @Test
    void testRemoveAddress(){
        postman.addAddress("Budapest, Fő út 1");
        postman.addAddress("Budapest, Fő út 2");
        postman.addAddress("Budapest, Fő út 3");
        postman.addAddress("Budapest, Fő út 1");
        postman.removeAddress("Budapest, Fő út 1");

        assertEquals("Budapest, Fő út 1", postman.getAddressList().get(2));
    }
}