import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AnotherOne {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(100));
        list.add(new Employee(500));
        list.add(new Employee(200));
        list.add(new Employee(50));

       List<Employee> employees=  list.stream()
               .filter(emp -> emp.salary > 250)
               .collect(Collectors.toList());
    employees.forEach(emp -> {
        System.
    });
    }
}

class Employee{
    public Employee(Integer sl){
        this.salary =sl;
    }
    Integer salary;
}
