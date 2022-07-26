import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeAvg {
    public static void main(String[] args) {
        List<Employee> list  = new ArrayList<>();
        list.add(new Employee(1, "eng", 100, "f1"));
        list.add(new Employee(2, "eng", 400, "f2"));
        list.add(new Employee(3, "eng", 150, "f3"));
        list.add(new Employee(4, "sales", 210, "f4"));
        list.add(new Employee(5, "sales", 400, "f5"));
// average salary per dept.
       Map<String, Double> map =  list
               .stream()
               .collect(Collectors.groupingBy(emp -> emp.dept,Collectors.averagingInt(emp -> emp.salary)));
        System.out.println(map);
       // Integer max = list.stream().max(Comparator.comparing(emp -> emp.salary)).get().salary;
        // second highest salary
        Integer salary = list
                .stream()
                .map(emp -> emp.salary)
                .distinct()
                .sorted((e1, e2) ->  e2-e1)
                .collect(Collectors.toList()).get(1);

        System.out.println(salary);

    }
}
class Employee{
    int id;
    String dept;
    int salary;
    String name;


    public Employee(int id, String dept, int salary, String name) {
        this.id = id;
        this.dept = dept;
        this.salary = salary;
        this.name = name;
    }
}

// LIst EMployee (/id, dept, salary , name) 2nd highest Empl name or id

// avg salary per department