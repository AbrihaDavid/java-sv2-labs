package controlselection.greetings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {

    Greetings greetings;

    @BeforeEach
    void init (){
        greetings = new Greetings();
    }

    @Test
    void testGreetings(){
        assertEquals("Jó reggelt",greetings.greetings(5,15));
        assertEquals("Jó éjt",greetings.greetings(20,15));
        assertEquals("Jó napot",greetings.greetings(18,30));
    }
}
