package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person person1 = new Person("John",15);
        Person person2 = person1;

        person2.setName("Jack");
        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getAge()); // Ugyanarra a memóriaterületre tartalmaztak referencit --> mindkettő változott

        int a = 24;
        int b = a;
        b = b+1;
        System.out.println(a + " " + b); // Itt nem a referencia másolódott, mert primitív a típus --> csak a "b" változott

        person1 = new Person("Bob",10);
        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getAge()); // A person1 már másik objektumra mutat a memóriaterületen --> változik az érték

    }
}
