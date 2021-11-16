package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private List<String> ingredients = new ArrayList<>();

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void addIngredients(Path path) {
        List<String> ingredientList = readFile(path);
        for (int i = 1; i < ingredientList.size(); i++) {
            if (!ingredientList.get(i).isEmpty()) {
                ingredients.add(ingredientList.get(i).substring(ingredientList.get(i).lastIndexOf(" ") + 1));
            }
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
