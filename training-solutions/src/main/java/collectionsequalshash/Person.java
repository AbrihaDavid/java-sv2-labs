package collectionsequalshash;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String taj;

    public Person(String name, int age, String taj) {
        this.name = name;
        this.age = age;
        this.taj = taj;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTaj() {
        return taj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(taj);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        return Objects.equals(this.taj,((Person) obj).taj);
    }

    public static void main(String[] args) {

        Person person = new Person("John Doe", 40,"10203040");
        Person person2 = new Person("Jack Doe", 50,"10203040");

        System.out.println(person.equals(person2));
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());
    }
}
