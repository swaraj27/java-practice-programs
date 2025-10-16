package InterviewQuestion;

import java.util.HashMap;

public class LeetCodeTwoSumEY {

    /*Given an array of integers, return indices of two numbers which add up to the target

    you may assume each input would have exactly one solution
    input nums=[2,7,11,15] target=9*/

    public static void main(String[] args) {

        int nums [] = {2,7,11,15};
        int target =9;

        /*for(int i=0; i< nums.length; i++){
            for(int j=i+1; j <nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println("list of indices = " + i + "," + j);
                }
            }
        }*/

        HashMap<Integer, Integer> findTarget = new HashMap<>();

        for(int i =0; i< nums.length; i++){

            int check = target - nums[i];

            findTarget.put(nums[i],check);
            if(findTarget.containsKey(check)){
                System.out.println(findTarget.get(check)+ "," +i);
            }

            findTarget.put(nums[i],i);
        }
    }
}
