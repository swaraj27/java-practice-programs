package stream.collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sort a list of integers in descending order.
public class DescendingOrder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2);
        List<Integer> sortedByDesc =  numbers.stream()
                                      .sorted(Comparator.reverseOrder())
                                      .collect(Collectors.toList());
        List<Integer> sorted = numbers.stream()
                               .sorted()
                                .collect(Collectors.toList());
        System.out.println("Sorted By Desc "+sortedByDesc);
        System.out.println("Sorted by asc : "+sorted);

    }
}
