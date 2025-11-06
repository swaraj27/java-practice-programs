package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ComputeRunnigSumList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> listOfSum = IntStream.range(0, list.size())
                                    .mapToObj(i -> list.subList(0,i+1).stream().mapToInt(Integer::intValue).sum())
                                    .collect(Collectors.toList());
    }
}
