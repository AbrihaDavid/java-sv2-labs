package interfaces.simpletasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTasksTest {

    @Test
    void testMethods(){
        SimpleTasks simpleTasks = new SimpleTasks(new ArrayList<>(Arrays.asList("Dog","Cat","Cow","Parrot")));
        simpleTasks.run();
        assertEquals(0,simpleTasks.getTasks().size());
    }

}