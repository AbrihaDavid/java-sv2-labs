package introjunit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GentlemanTest {

    @Test
    public void testName(){
        assertEquals("Hello John Doe", new Gentleman().sayHello("John Doe"));
    }

    @Test
    void testNameNull(){
        assertEquals("Hello Anonymous",new Gentleman().sayHello(null));
    }
}
