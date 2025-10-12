package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringOperations {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("radar", "level", "world", "java");
        List<String> palindromes = words.stream().
                filter(s -> s.equals(new StringBuilder(s).reverse().toString())).
                collect(Collectors.toList());

        System.out.println("palindrome "+ palindromes);

        //Reverse each string in a list.
        List<String> str = Arrays.asList("List","Ram","Sam");
        List<String> reverse = str.stream().map(strn -> new StringBuilder(strn).reverse().toString()).collect(Collectors.toList());
        System.out.println("reverse "+reverse);
//        find frequent character in string

        String input = "success";

        char mostFrequent = input.chars()
                            .mapToObj(c -> (char) c)
                            .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                            .entrySet().stream()
                            .max(Map.Entry.comparingByValue())
                            .map(Map.Entry::getKey)
                            .orElse(' ');
        System.out.println("Most frequent char "+ mostFrequent);
    }
}
