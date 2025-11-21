package InterviewQuestion;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfEachElement {
    public static void main(String[] args) {
        String arr [] = {"a","b","c","a","a","b"};

        Map<Object, Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(s -> s , Collectors.counting()));
        System.out.println(map);

    }
}
