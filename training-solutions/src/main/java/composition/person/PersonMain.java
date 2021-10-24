package composition.person;


public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person("David","IDDJ32");
        person.moveTo(new Address("Hungary","Debrecen","Egyetem tér 1","4032"));
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        person.correctData("Jack","DKSADK23");
        person.getAddress().correctData("USA","Kansas city","Main st. 5","10020");
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

    }
}
