package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {

    public static void main(String[] args) {

        List<String> importantThings = Arrays.asList("tea","more tea", "..and some more tea");
        System.out.println(importantThings);

        importantThings.set(2,"just kidding... it's tea");
        System.out.println(importantThings);
    }
}
