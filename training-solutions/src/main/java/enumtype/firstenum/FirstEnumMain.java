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

        Football goalkeeper = Football.GOALKEEPER;
        System.out.println(goalkeeper.name());
        Football defender = Football.DEFENDER;
        System.out.println(defender.name());
        Football midfielder = Football.MIDFIELDER;
        System.out.println(midfielder.name());
        Football forward = Football.FORWARD;
        System.out.println(forward.name());
    }
}
