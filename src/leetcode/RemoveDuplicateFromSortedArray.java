package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {

        //[0,0,1,1,1,2,2,3,3,4]

        int nums[] =  {0,0,1,1,1,2,2,3,3,4}; //{1,1,1,2,2,3,3,3,4,4,5};
        int index = 0;

        for(int i=1; i< nums.length; i++){
            if(nums[i] != nums[index]){
                index ++;
                nums[index] = nums[i];

            }
        }

        for(int j = 0; j <= index; j++){
            System.out.println(nums[j] + " ");
        }
        int count = index + 1;

        System.out.println("count : " + count );
    }


}
