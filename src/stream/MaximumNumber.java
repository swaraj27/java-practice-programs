package stream;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int maxNum = numbers.stream()
                    .max(Integer::compare).get();

        System.out.println("maxNum "+maxNum);

    }
//find maximum number from list

}
