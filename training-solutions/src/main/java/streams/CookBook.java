package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CookBook {

    private List<Cake> cakes = new ArrayList<>();

    public CookBook(List<Cake> cakes) {
        this.cakes = cakes;
    }

    public List<Cake> getCakes() {
        return cakes;
    }

    public List<String> listCakeNamesWithGivenIngredient(String ingredient){
        return cakes.stream().
                filter(ing -> ing.getIngredients().contains(ingredient)).
                map(Cake::getName).
                collect(Collectors.toList());
    }

    public List<String> listCakeNamesWithMaxIngredients(int max){
        return cakes.stream().
                filter(ing -> ing.getIngredients().size() <= max).
                map(Cake::getName).
                collect(Collectors.toList());
    }
}
