package controlselection.accents;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutAccentsTest {

    WithoutAccents withoutAccents;

    @BeforeEach
    void init(){
        withoutAccents = new WithoutAccents();
    }

    @Test
    void testRemoveAccent(){
        assertEquals('d',withoutAccents.removeAccent('d'));
        assertEquals('o',withoutAccents.removeAccent('ő'));
        assertEquals('u',withoutAccents.removeAccent('ü'));
        assertEquals('a',withoutAccents.removeAccent('a'));
    }
}
