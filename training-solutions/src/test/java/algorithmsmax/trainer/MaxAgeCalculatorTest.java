package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    void getTrainerWithMaxAge() {

        List<Trainer> trainers = Arrays.asList(
                new Trainer("Jack",20),
                new Trainer("Bob",50),
                new Trainer("Jill",41)
        );

        assertEquals(trainers.get(1),new MaxAgeCalculator().getTrainerWithMaxAge(trainers));
    }
}