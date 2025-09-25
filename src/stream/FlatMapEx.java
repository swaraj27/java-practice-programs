package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of lists, flatten it into a single list
public class FlatMapEx {

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        List<Integer> collectList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("Flatten list "+collectList);
    }
}
