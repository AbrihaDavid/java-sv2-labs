package collectionsset;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuestionGameTest {

    @Test
    void testWithNotEnoughNames(){
        QuestionGame q = new QuestionGame(new ArrayList<>(Arrays.asList(
                new RightAnswer("John"),
                new RightAnswer("Jack"),
                new RightAnswer("John"),
                new RightAnswer("John"),
                new RightAnswer("Jack"),
                new RightAnswer("Jane"),
                new RightAnswer("Bob"),
                new RightAnswer("Jack"),
                new RightAnswer("Bob"),
                new RightAnswer("John")
        )));

        assertThrows(IllegalArgumentException.class, ()-> q.drawWinners());
    }

    @Test
    void testWithEnoughNames(){
        QuestionGame q = new QuestionGame(new ArrayList<>(Arrays.asList(
                new RightAnswer("John"),
                new RightAnswer("David"),
                new RightAnswer("John"),
                new RightAnswer("Melinda"),
                new RightAnswer("Jack"),
                new RightAnswer("Joe"),
                new RightAnswer("Jack"),
                new RightAnswer("Jane"),
                new RightAnswer("Bob"),
                new RightAnswer("Jack"),
                new RightAnswer("Daniel"),
                new RightAnswer("Joe"),
                new RightAnswer("Bob"),
                new RightAnswer("Jacob"),
                new RightAnswer("John")
        )));

        assertEquals(5,q.drawWinners().size());
    }

}