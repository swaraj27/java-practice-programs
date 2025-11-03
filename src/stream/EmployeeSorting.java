package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorting {
    public static void main(String[] args) {

        List<Employee> listEmp = Arrays.asList(
                new Employee("Alice", "HR", 50000, 30, true),
                new Employee("Bob", "HR", 55000, 35, true),
                new Employee("Charlie", "IT", 70000, 28, true),
                new Employee("David", "IT", 75000, 40, false),
                new Employee("Eve", "Finance", 60000, 32, true)
        );

    List<Employee> sortBySalaryAndName = listEmp.stream().
                                        sorted(Comparator.comparing(Employee::getName)
                                                .thenComparing(Employee::getSalary))
            .collect(Collectors.toList());


    }
}
