package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {

    public static void main(String[] args) {

        for (Continent continent: Continent.values()){
            System.out.println(continent);
        }

        System.out.println(Arrays.toString(Continent.values()));

        System.out.println(Ocean.valueOf("PACIFIC"));
        System.out.println(Ocean.valueOf("ATLANTIC"));
        System.out.println(Ocean.valueOf("INDIAN"));
        System.out.println(Ocean.valueOf("SOUTHERN"));
        System.out.println(Ocean.valueOf("ARCTIC"));
    }
}
