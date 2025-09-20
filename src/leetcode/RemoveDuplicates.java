package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1};

        int[] uniqueArr = Arrays.stream(arr)
                .distinct()   // removes duplicates
                .toArray();

        System.out.println(Arrays.toString(uniqueArr));
    }
}
