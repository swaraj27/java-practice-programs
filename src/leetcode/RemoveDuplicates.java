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

        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int arr[]){
        Arrays.sort(arr); // {1,1,2,2,3}

        int i=0;
        for(int j=1; j < arr.length; j++){

            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;

    }
}
