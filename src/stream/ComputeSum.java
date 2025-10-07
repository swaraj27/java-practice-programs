package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ComputeSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum  = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum  = "+sum);

//        Use parallel streams to compute the sum of numbers.

        int summ = numbers.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println("using parallel stream "+ summ);

        // Create a custom collector to join strings with a delimiter.
        List<String> words = Arrays.asList("Java", "Stream", "API");
        String joined = words.stream().collect(Collectors.joining(","));
        System.out.println("joined string "+ joined);

         // Remove null values from a list using filter.
        List<String> wordsFilter = Arrays.asList("Java",null,"Stream",null,"API");
        List<String> removeNull = wordsFilter.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println("remove null " + removeNull);
    }
}
