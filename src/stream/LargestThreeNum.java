package stream;

import java.util.*;
import java.util.stream.Collectors;

public class LargestThreeNum {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,4,1,6,1,5);
        // print largest 3 numbers
        List<Integer> largeThree = num.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println("largeThree "+ largeThree);

        // first non reapeting numbers

        Optional<Integer> nonRepeating = num.stream()
                            .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new,Collectors.counting()))
                            .entrySet().stream()
                            .filter(n -> n.getValue() ==1)
                            .map(Map.Entry::getKey)
                            .findFirst();

        System.out.println("non repeating "+nonRepeating);

    }
}
