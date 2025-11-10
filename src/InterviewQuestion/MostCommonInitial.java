package InterviewQuestion;

import stream.Employee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonInitial {
    public static void main(String[] args) {
        List<Employee> listEmp = Arrays.asList(
                new Employee("Alice", "HR", 50000, 30, true),
                new Employee("Bob", "HR", 55000, 35, true),
                new Employee("Charlie", "IT", 70000, 28, true),
                new Employee("David", "IT", 75000, 40, false),
                new Employee("Ave", "Finance", 60000, 32, true)
        );


        Map<Character,Integer> map = new HashMap<>();

        for(Employee emp : listEmp){
            char key = emp.getName().charAt(0);
            map.put(key,map.getOrDefault(key,0)+1);
        }

        int count = 0;
        char str = ' ';
        for (Map.Entry<Character,Integer> empl :map.entrySet()){
            if(empl.getValue() > count){
                count = empl.getValue();
                str = empl.getKey();
            }
        }

        System.out.println("Common Initial : "+str);
    }
}
