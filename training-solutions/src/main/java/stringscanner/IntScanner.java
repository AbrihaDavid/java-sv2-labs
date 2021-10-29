package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntScanner {

    public String convertInts (String ints){
        Scanner sc = new Scanner(ints).useDelimiter(";");
        List<Integer> intList = new ArrayList<>();
        while (sc.hasNext()) {
            int i = Integer.parseInt(sc.next());
            if (i > 100) {
                intList.add(i);
            }
        }
        return intList.toString();
    }

    public static void main(String[] args) {

        IntScanner intScanner = new IntScanner();
        System.out.println(intScanner.convertInts("5;3;107;12;123;18;198"));
    }
}
