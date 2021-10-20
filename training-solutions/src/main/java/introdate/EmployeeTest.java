package introdate;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class EmployeeTest {

    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(1995,4,27);
        LocalDateTime beginEmployment = LocalDateTime.of(2019,9,1,8,0);
        Employee employee = new Employee("David",dateOfBirth,beginEmployment);

        System.out.println(employee.getName() + "\n" + employee.getDateOfBirth() + "\n" + employee.getBeginEmployment());
    }
}
