package collectionsmap;

import java.util.Map;
import java.util.TreeMap;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants){
        String result = "";
        Map<Integer,String> list = new TreeMap<>();
        list.putAll(applicants);
        for(Map.Entry entry: list.entrySet()){
            int i = Integer.parseInt(entry.getKey().toString());
            if (i > lastNumber){
                result = entry.getValue().toString();
                break;
            }
        }
        return result;
    }
}
