package stream;

import java.util.Arrays;
import java.util.List;
//Check if any string in a list contains “API”.
public class MatchCondition {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
        boolean check = strings.stream().anyMatch(s -> s.contains("API"));
        System.out.println("Check "+check);
    }
}
