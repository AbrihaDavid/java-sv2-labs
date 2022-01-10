package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {

        Set<Student> s = new TreeSet<>(new StudentComparator());
        Student s1 = new Student("Jack",120);
        Student s2 = new Student("Jane",100);
        Student s3 = new Student("Joe",150);
        Student s4 = new Student("Tom",146);
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);

        System.out.println(s);

        Map<String, Integer> m = new TreeMap<>(Collator.getInstance(new Locale("hu","HU")));
        m.put(s1.getName(),s1.getHeight());
        m.put(s2.getName(),s2.getHeight());
        m.put(s3.getName(),s3.getHeight());
        m.put(s4.getName(),s4.getHeight());

        System.out.println(m);
    }
}
