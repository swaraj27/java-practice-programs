package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String args[]){

        String strs[] = {"flower", "flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs){
        String result = "";
        Arrays.sort(strs);
        Arrays.stream(strs).forEach(System.out::println);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;

        while(index < str1.length()){
            if(str1.charAt(index) == str2.charAt(index)){
                index ++;
            }else{
                break;
            }

            result =  index == 0 ? "": str1.substring(0,index);
        }
        return result;
    }
}
