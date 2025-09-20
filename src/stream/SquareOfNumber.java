package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumber {
    public static void main(String[] args) {

        //Use Stream API to square each number in the list and collect the result into a new list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squareOfNumber = numbers.stream()
                                       .map(num-> num*num)
                                        .collect(Collectors.toList());
        System.out.println("Square of Number " + squareOfNumber);

        //Use Stream API to find the length of the longest name in the list.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        int len=0;
        for (String name:names){
                  if(name.length()>len){
                      len= name.length();
                  }
        }

        System.out.println("name len "+len);
        int getLen = names.stream().mapToInt(String::length).max().orElse(0);
        System.out.println("max len "+getLen);
    }
}
