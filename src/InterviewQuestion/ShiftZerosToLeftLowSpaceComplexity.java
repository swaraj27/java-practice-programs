package InterviewQuestion;

import java.util.Arrays;

public class ShiftZerosToLeftLowSpaceComplexity {
    public static void main(String[] args) {
        int arr [] = {4,5,0,1,3,0,0};
        moveToLeft(arr);
    }

    public static int[] moveToLeft(int arr[]){
        int n = arr.length;
        int output[] = new int[n];

        // 0,0,3,1,0,5,4
        int index = n - 1;
        for(int i = n-1; i >=0; i-- ){
            if(arr[i] != 0){
                output[index--] = arr[i];
            }
        }
        System.out.println("Output : "+ Arrays.toString(output));
        return output;

    }
}
