package algorithmsfilter.movie;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {

    @Test
    void getGoodMoviesWithCategoryGiven() {

        Movie movie1 = new Movie("Titanic",Category.DRAMA,4);
        Movie movie2 = new Movie("The Lord of the Rings",Category.ACTION,5);
        Movie movie3 = new Movie("Batman",Category.ACTION,4);
        Movie movie4 = new Movie("Gravity",Category.DRAMA,1);

        VideoTheque videoTheque = new VideoTheque(
                new ArrayList<>(Arrays.asList(
                        movie1,
                        movie2,
                        movie3,
                        movie4
                ))
        );

        assertEquals(1, videoTheque.getGoodMoviesWithCategoryGiven(Category.DRAMA).size());
    }
}