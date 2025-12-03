package InterviewQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int arr [] = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    public static int [] twoSum(int nums[], int target){

        Map<Integer,Integer> findArr = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            int reqNum = target - nums[i];
            if(findArr.containsKey(reqNum)){
                int arr [] = {findArr.get(reqNum), i};
                return arr;
            }
            findArr.put(nums[i], i);
        }
        return null;
    }
}
