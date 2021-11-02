package introjunit;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {

    @Test
    public void testName(){
        assertThat (new Gentleman().sayHello("John Doe"), equalTo("Hello John Doe"));
        assertThat (new Gentleman().sayHello(null), equalTo("Hello Anonymous"));
    }
}
