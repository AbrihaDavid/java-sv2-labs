package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Paths;

import static org.junit.Assert.*;

public class RecipeTest {

    @Test
    public void testIngredientList(){
        Recipe recipe = new Recipe();
        recipe.addIngredients(Paths.get("training-solutions/src/test/resources/recipe.txt"));
        assertEquals("citrom",recipe.getIngredients().get(4));
    }

    @Test
    public void testWrongIngredientList(){
        Recipe recipe = new Recipe();
        recipe.addIngredients(Paths.get("training-solutions/src/test/resources/recipe.txt"));
        assertNotEquals("40 dkg liszt",recipe.getIngredients().get(0));
    }
}