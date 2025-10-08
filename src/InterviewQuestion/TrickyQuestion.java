package InterviewQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TrickyQuestion {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,3,9,3,7,5,1);

        String result = numbers.stream().distinct().sorted(Comparator.reverseOrder()).
                        skip(2).limit(3).map(String::valueOf).
                        collect(Collectors.joining(","));

        System.out.println("result " + result);
    }
}
