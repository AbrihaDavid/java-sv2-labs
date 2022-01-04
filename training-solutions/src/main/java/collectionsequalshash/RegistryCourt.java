package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {

    public static void main(String[] args) {

        List<Company> companies = new ArrayList<>();

        Company company = new Company("A","102030");
        Company company2 = new Company("B","10203040");
        Company company3 = new Company("C","10203050");
        Company company4 = new Company("D","10203060");

        companies.add(company);
        companies.add(company2);
        companies.add(company3);
        companies.add(company4);

        System.out.println(companies.contains(new Company("A","102030")));
        System.out.println(companies.contains(new Company("B","10203040")));
        System.out.println(companies.contains(new Company("C","10203050")));
        System.out.println(companies.contains(new Company("D","10203060")));
    }
}
