package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Sort a list based on the frequency of elements in descending order.
// Output: [4, 5, 6, 3]

public class SortListOnFreqElement {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 6, 5, 4, 3);

        List<Integer> sortedList = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
