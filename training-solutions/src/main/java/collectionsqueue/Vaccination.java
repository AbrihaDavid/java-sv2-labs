package collectionsqueue;

import java.util.*;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people){
        Queue<Integer> que = new PriorityQueue<>();
        Set<Integer> orderedList = new TreeSet<>();
        for (Person p: people){
            if (p.getAge() >= 18 && p.getAge() <= 65){
                orderedList.add(p.getAge());
            }
        }
        que.addAll(orderedList);

        return que;
    }

    public static void main(String[] args) {

        Vaccination vaccination = new Vaccination();
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Jack",5),
                new Person("John",18),
                new Person("Bob",60),
                new Person("Paul",90),
                new Person("Ferdinand",45)
        ));

        System.out.println(vaccination.getVaccinationOrder(people));
        System.out.println(vaccination.getVaccinationOrder(people).poll());
    }
}
