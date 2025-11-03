package stream;

import java.util.*;
import java.util.stream.Collectors;

public class SecondHighestSalary {
    public static void main(String[] args) {

        List<Employee> listEmp = Arrays.asList(
                new Employee("swaraj","computer",12990,27,true),
                new Employee("nilesh","accounts",15990,28,true),
                new Employee("arun","hospital",30990,25,true),
                new Employee("amol","derma",10990,31,false)
        );

        Optional<Employee> secondHighestEmp = listEmp.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()) // sort by salary desc
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(() ->
                                new TreeSet<>(Comparator.comparingDouble(Employee::getSalary))), // remove duplicates by salary
                        list -> list.stream().skip(1).findFirst() // skip first -> second highest
                ));

        if (secondHighestEmp.isPresent()) {
            System.out.println("Second Highest Salary Employee: " + secondHighestEmp.get(
                    
            ).getSalary());
        } else {
            System.out.println("No second highest salary found.");
        }
    }
}



