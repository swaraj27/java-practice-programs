package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStartingNumberWithDigit {
    //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        List<String> filtered = myList.stream().map(s -> s+"").filter(o -> o.startsWith("1")).collect(Collectors.toList());

        System.out.println("Filtered : "+filtered);

        int[] arr = {10,15,8,49,25,98,32};

        List<String> filteredArr = Arrays.stream(arr).boxed().map(s ->s + "").filter(so -> so.startsWith("1")).collect(Collectors.toList());
        System.out.println("Arr Filtered "+ filteredArr);

    }
}
