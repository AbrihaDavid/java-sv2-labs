package stringseparate;

import java.util.Arrays;
import java.util.List;

public class IceCream {

    public static void main(String[] args) {

        List<String> iceCreamTypes = Arrays.asList("Chocolate","Vanilla","Punch","Lemon");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<iceCreamTypes.size(); i++){
            if (i != 0){
                stringBuilder.append(", ");
            }
            stringBuilder.append(iceCreamTypes.get(i));
        }
        System.out.println("Today's offer: " + stringBuilder.toString() + ". Half price for children!");
    }
}
