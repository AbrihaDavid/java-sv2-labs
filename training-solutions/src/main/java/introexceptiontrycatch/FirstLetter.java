package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("Dog", "Cat", "Bird", "Whale",null));
        for (String s : words) {
            try {
                System.out.println(s.charAt(0));
            } catch (StringIndexOutOfBoundsException ioobe) {
                System.out.println(ioobe.getMessage());
            } catch (NullPointerException npe) {
                System.out.println(npe.getMessage());
            }
        }
    }
}
