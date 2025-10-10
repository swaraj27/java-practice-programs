package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Calculate the average of a list of integers.
public class NumberAverage {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        double  average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println("average : "+average);

        // Convert a list of strings into a map with the string as the key and its length as the value.
        List<String> words = Arrays.asList("Java", "Stream", "API");
        Map<String,Integer> mapWords = words.stream().collect(Collectors.toMap(s -> s,String::length));
        System.out.println("Map words "+ mapWords);

        //Partition a list of numbers into even and odd.
        List<Integer> numP = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> partitionNum = numP.stream().collect(Collectors.partitioningBy(n -> n%2 ==0));
        System.out.println("Partition "+ partitionNum);

        Map<String,List<Integer>> evenOdd = numP.stream().collect(Collectors.groupingBy(s -> s% 2 ==0 ? "even":"odd"));
        System.out.println("Even odd " + evenOdd);

    }
}
