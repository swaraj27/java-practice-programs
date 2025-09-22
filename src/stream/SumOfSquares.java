package stream;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfNumbers = numbers.stream().
                           filter(num -> num % 2 == 0)
                           .map(n -> n*n)
                           .mapToInt(Integer::intValue).sum();
        System.out.println("sum of Event numbers "+ sumOfNumbers);
    }
}
