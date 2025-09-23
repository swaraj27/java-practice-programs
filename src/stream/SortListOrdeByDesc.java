package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sort list by Desc order
public class SortListOrdeByDesc {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2);
        List<Integer>  sortedList = numbers.stream()
                                    .sorted(Comparator.reverseOrder())
                                    .collect(Collectors.toList());
        System.out.println("Sorted List " + sortedList);
    }
}
