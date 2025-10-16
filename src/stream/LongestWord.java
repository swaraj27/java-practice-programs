package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Offer is coming";

        String longestStream = Arrays.stream(sentence.split(" "))
                        .max(Comparator.comparingInt(String::length))
                        .orElse(null);
        System.out.println("Longest Stream "+ longestStream);

    }
}
