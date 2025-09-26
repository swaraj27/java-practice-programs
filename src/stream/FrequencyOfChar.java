package stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Count the frequency of each character in a string.
public class FrequencyOfChar {


    public static void main(String[] args) {
        String input = "success";

        Map<Character,Long> charFreq = input.chars().mapToObj(c -> (char) c)
                                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("char freq "+ charFreq);
    }
}
