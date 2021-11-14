package introexceptionmoreexceptions;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\n" +
                "Age : " + age;
    }

    public static void main(String[] args) {

        Person person = new Person(null,32);
        System.out.println(person.toString());
        System.out.println(person.getName());
        System.out.println(person.getName().toUpperCase()); // Itt a hiba, nullpointer... null-t adtunk meg a nevének, és azzal próbáltunk műveletet végezni
    }
}
