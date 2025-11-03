package InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftZerosToLeft {
    public static void main(String[] args) {
        int arr [] = {1,0,5,0,3,0,2};
        List<Integer> nonZeros = new ArrayList<>();
        List<Integer> zeros = new ArrayList<>();
        for(int i=0; i< arr.length; i++){

            if(arr[i] != 0){
                nonZeros.add(arr[i]);
            }else{
                zeros.add(arr[i]);
            }

        }

        nonZeros.addAll(zeros);

        System.out.println("Final output : "+nonZeros);





    }
}
