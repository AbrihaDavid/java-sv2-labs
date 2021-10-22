package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {

        List<String> freezer = new ArrayList<>();
        freezer.add("corn");
        freezer.add("pea");
        freezer.add("meat");
        freezer.add("fish");
        freezer.add("pizza");

        System.out.println(freezer);
        System.out.println(freezer.size());

        freezer.remove(0);
        freezer.remove(0);

        System.out.println(freezer);
        System.out.println(freezer.size());
    }
}
