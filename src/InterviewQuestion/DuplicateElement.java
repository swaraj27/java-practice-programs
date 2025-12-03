package InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElement {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 4, 3, 5};
        Arrays.sort(arr); // [1,2,2,3,3,4,5]

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< arr.length - 1; i++){
            if(arr[i] == arr[i+1] && !list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        list.forEach(System.out::println);
    }
}
