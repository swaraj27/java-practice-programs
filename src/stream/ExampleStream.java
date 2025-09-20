package stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ExampleStream {
    public static void main(String[] args) {
        //take number where 0 should not be there and it should be in ascending order
        int arr [] = {567,234,605,600,7007,8760};


        String result = Arrays.stream(arr)
                                .filter(num -> !String.valueOf(num).contains("0"))
                                .sorted()
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining(", "));
        System.out.println("result "+ result);
    }
}
