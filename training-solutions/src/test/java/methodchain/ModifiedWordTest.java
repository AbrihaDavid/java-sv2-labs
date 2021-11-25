package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    @Test
    void modify() {
        assertEquals("KxRy",new ModifiedWord().modify("körte"));
    }
}