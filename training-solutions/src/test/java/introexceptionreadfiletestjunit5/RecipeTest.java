package introexceptionreadfiletestjunit5;

import introexceptionreadfiletestjunit4.Recipe;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void testIngredientList() {
        introexceptionreadfiletestjunit4.Recipe recipe = new Recipe();
        recipe.addIngredients(Paths.get("training-solutions/src/test/resources/recipe.txt"));
        assertEquals("citrom", recipe.getIngredients().get(4));
    }

    @Test
    void testWrongIngredientList() {
        Recipe recipe = new Recipe();
        recipe.addIngredients(Paths.get("training-solutions/src/test/resources/recipe.txt"));
        assertNotEquals("40 dkg liszt", recipe.getIngredients().get(0));
    }
}