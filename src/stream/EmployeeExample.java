package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeExample {
    public static void main(String args[]){

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 50000, 30, true),
                new Employee("Bob", "HR", 55000, 35, true),
                new Employee("Charlie", "IT", 70000, 28, true),
                new Employee("David", "IT", 75000, 40, false),
                new Employee("Eve", "Finance", 60000, 32, true)
        );

        Map<String,Double> averageSalaries = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        averageSalaries.forEach((department,salary) ->{
            System.out.println("Department: "+department + ", Average Salary: "+salary);
        });
    }


}
