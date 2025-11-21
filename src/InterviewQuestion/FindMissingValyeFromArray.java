package InterviewQuestion;

import java.util.Arrays;

public class FindMissingValyeFromArray {
    public static void main(String[] args) {
        int arr[] = {2,0,3};
        System.out.println("missing value "+ missingValue(arr));
    }

    public static  int missingValue(int arr[]){
        Arrays.sort(arr);
        int n  = arr.length;

        int total = n * (n + 1)/ 2;

        int actualSum  = 0;
        for(int num : arr ){
            actualSum +=  num;
        }
        return total - actualSum;
    }
}
