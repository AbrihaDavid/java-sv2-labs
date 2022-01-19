package streamsalgorithms;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {

    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("John",1990),
                new Employee("Jane",2001),
                new Employee("Jack",1965),
                new Employee("Bob",1984),
                new Employee("Tom",1995)
        ));

        int sumYearOfBirth = employees.stream().map(Employee::getYearOfBirth).mapToInt(i -> i).reduce(0,Integer::sum);
        System.out.println(sumYearOfBirth);

        int sumAge = employees.stream().map(Employee::getYearOfBirth).map(age -> 2022-age).reduce(0,Integer::sum);
        System.out.println(sumAge);

        long numOfEmployees = employees.stream().count();
        System.out.println(numOfEmployees);

        long numOfEmployeesBornBefore = employees.stream().filter(year -> year.getYearOfBirth() < 1990).count();
        System.out.println(numOfEmployeesBornBefore);

        OptionalInt ageOfYoungestEmployee = employees.stream().map(age -> 2022 - age.getYearOfBirth()).mapToInt(i -> i).min();
        System.out.println(ageOfYoungestEmployee.getAsInt());

        boolean everyEmployeeBornBefore = employees.stream().allMatch(year -> year.getYearOfBirth() < 1980);
        System.out.println(everyEmployeeBornBefore);

        String nameOfOldestEmployee = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getYearOfBirth() - o2.getYearOfBirth();
            }
        }).map(e -> e.getName()).findFirst().orElseThrow(()-> new IllegalArgumentException("Empty"));
        System.out.println(nameOfOldestEmployee);

        List<Employee> employeesBornBefore = employees.stream().filter(year -> year.getYearOfBirth() < 1990).collect(Collectors.toList());
        System.out.println(employeesBornBefore.size() == numOfEmployeesBornBefore);

        List<String> nameOfEmployees = employees.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(nameOfEmployees);

        List<String> nameOfEmployeesBornBefore = employees.stream().filter(year -> year.getYearOfBirth() < 1990).map(Employee::getName).collect(Collectors.toList());
        System.out.println(nameOfEmployeesBornBefore);
    }
}