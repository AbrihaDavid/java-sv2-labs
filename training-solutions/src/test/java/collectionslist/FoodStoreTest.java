package collectionslist;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FoodStoreTest {

    FoodStore foodStore = new FoodStore();

    @Test
    void testAddFood(){
        foodStore.addFood(new Food("Cheese", LocalDate.of(2022,1,8)));
        assertEquals(1, foodStore.getFoodList().size());
    }

    @Test
    void testSellFirst(){
        foodStore.addFood(new Food("Cheese", LocalDate.of(2022,1,8)));
        foodStore.addFood(new Food("Milk", LocalDate.of(2022,1,10)));
        foodStore.addFood(new Food("Meat", LocalDate.of(2022,1,12)));

        foodStore.sellFirst(new Food("Yogurt",LocalDate.of(2022,1,5)));
        assertEquals("Yogurt",foodStore.getFoodList().get(0).getName());
    }

}