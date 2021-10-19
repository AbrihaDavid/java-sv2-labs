package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {

    public static void main(String[] args) {


        Prefix prefix = new Prefix("Mr.");
        FirstName firstName = new FirstName("David");
        LastName lastName = new LastName("Abriha");

        System.out.println(prefix.getPre() + " " + lastName.getLast() + " " + firstName.getFirst());

    }

}
