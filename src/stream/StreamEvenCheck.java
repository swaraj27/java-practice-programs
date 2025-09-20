package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEvenCheck {
    public  static void main(String args[]){
        System.out.println("Stream basic ex");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<String> names = Arrays.asList("Apple", "Banana", "Apricot", "Cherry", "Avocado","John");

        List<Integer> evenNum = numbers.stream().filter(num -> num % 2 ==0)
                .collect(Collectors.toList());
        System.out.println("Even Num "+ evenNum);

        List<Integer> squares = numbers.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println("Squares " + squares);

        long countA = names.stream().filter(name -> name.startsWith("A")).count();
        System.out.println("Count " + countA);

        List<String> sortName = names.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted name  " + sortName);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of numbers "+sum);

        List<String> toUpperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("to upper case Name  "+toUpperCase);

        List<Integer> num = Arrays.asList(1,1,1,2,3,3,4,5,6,7,8,8,8,9,10,10);
        List<Integer> removeDuplicate = num.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique val "+removeDuplicate);



    }
}
