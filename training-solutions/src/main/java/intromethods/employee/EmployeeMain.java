package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("Jack",2010,200000);
        System.out.println(employee);

        System.out.println(employee.getName());
        System.out.println(employee.getHiringYear());
        System.out.println(employee.getSalary());
        employee.raiseSalary(200000);
        employee.setName("Joe");
        System.out.println(employee);
    }
}
