package collectionsmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {

    private Map<String, Integer> money = new HashMap<>();

    public Map<String, Integer> getMoney() {
        return money;
    }

    public void loadInpayments(Path path){

        List<String> file = new ArrayList<>();

        try {
            file = Files.readAllLines(path);
        }
        catch (IOException ioe){
            System.out.println("File not found");
        }

        String [] temp;

        for (String s: file){
            temp = s.split(":");
            money.put(temp[0],Integer.parseInt(temp[1].trim()));
        }
    }
}
