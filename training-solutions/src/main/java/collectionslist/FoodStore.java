package collectionslist;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FoodStore {

    List<Food> foodList = new LinkedList<>();

    public List<Food> getFoodList() {
        return foodList;
    }

    public void addFood(Food food){
        foodList.add(food);
    }

    public void sellFirst(Food food){
        if (food.getExpDate().equals(LocalDate.now())){
            foodList.set(0,food);
        }
    }
}
