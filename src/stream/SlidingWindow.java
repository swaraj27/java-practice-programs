package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Create a sliding window of size 3 for a list of integers.
public class SlidingWindow {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        //normal approach
        int size = 3;
        System.out.println(slidingWindow(size,numbers));

        List<List<Integer>> subList = IntStream.rangeClosed(0,numbers.size() - size)
                                    .mapToObj(i ->  numbers.subList(i, i+size))
                                    .collect(Collectors.toList());
        System.out.println("using stream api "+ subList);
    }

    public static List<List<Integer>> slidingWindow(int size, List<Integer> numbers){
        List<List<Integer>> slidingWindow = new ArrayList<>();

        for(int i=0; i<= numbers.size() - size; i++){

            List<Integer> list = new ArrayList<>();
                for(int j = i ; j < i +size; j++){
                    list.add(numbers.get(j));
                }
            slidingWindow.add(list);
        }
        return slidingWindow;

    }
}
