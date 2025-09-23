package stream;

import java.util.Arrays;
import java.util.List;

//Count String with specific prefix Ex. 'A'
public class CountStringWithPrefix {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");

        long count = names.stream().filter(name-> name.startsWith("A")).count();

        System.out.println("Count "+ count);
    }
}
