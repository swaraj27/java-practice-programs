package stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

// Find First Non-Repeated Character in a String
public class FindFirstNonRepeatChar {
    public static void main(String[] args) {
        String str = "swiss";

        Character firstNonRepeated = str.chars()
                                                .mapToObj(c -> (char) c)
                                                .collect(Collectors.groupingBy(
                                                        Function.identity(),
                                                        LinkedHashMap::new,
                                                        Collectors.counting()
                                                )).entrySet().stream()
                                                .filter(entry ->entry.getValue() == 1 )
                                                .map(Map.Entry::getKey).
                                                findFirst()
                .orElse(null);

        System.out.println("First non repeated char " + firstNonRepeated);
    }
}
