package collectionsiterator;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HomeSchoolingTest {

    HomeSchooling homeSchooling = new HomeSchooling(new ArrayList<>(Arrays.asList(
            new OnlineLesson("Joe","geography", LocalDateTime.of(2022,1,10,10,0)),
            new OnlineLesson("Joe","geography", LocalDateTime.of(2022,1,10,16,0)),
            new OnlineLesson("Jack","maths", LocalDateTime.of(2022,1,11,8,0)),
            new OnlineLesson("Jack","maths", LocalDateTime.of(2022,1,11,10,0)),
            new OnlineLesson("Joe","geography", LocalDateTime.of(2022,1,11,10,0))
    )));

    @Test
    void addNewLesson() {
        homeSchooling.addNewLesson(new OnlineLesson("Jane","music",LocalDateTime.of(2022,1,10,14,0)));
        assertEquals("Jane",homeSchooling.getOnlineLessons().get(1).getTeacherName());
    }

    @Test
    void getLessonsByTitle() {
        assertEquals(3, homeSchooling.getLessonsByTitle("geography").size());
    }

    @Test
    void removeLesson() {
        homeSchooling.removeLesson(LocalDateTime.of(2022,1,10,16,0));
        assertEquals(4,homeSchooling.getOnlineLessons().size());
    }
}