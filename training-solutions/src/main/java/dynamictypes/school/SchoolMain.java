package dynamictypes.school;

public class SchoolMain {

    public static void main(String[] args) {

        School school = new School("School", 12);
        School primarySchool = new PrimarySchool("P. School", 8);
        School secondarySchool = new SecondarySchool("S. School", 4);

        System.out.println(school.toString());
        System.out.println(primarySchool.toString());
        System.out.println(secondarySchool.toString());
    }
}
