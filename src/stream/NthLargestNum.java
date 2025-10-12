package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NthLargestNum {

    //Find the 3rd largest element in a list.
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 50, 40, 30);
        int nthLargest = numbers.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(0);
        System.out.println("nthe largest "+ nthLargest);
        //find all palindrom string in list




    }
}
