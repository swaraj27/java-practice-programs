package leetcode;

public class FindFirstOccurranceInString {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad","sad"));
    }

    public static int strStr(String hystack, String needle){
        int needleLen = needle.length();
        int  counter = 0;
        char hystackArr [] = hystack.toCharArray();
        char needleAr[] =  needle.toCharArray();
        for(int i=0; i < needleLen; i++){
            if(hystackArr[i] == needleAr[i]){
                counter ++;
            }
        }
        return needleLen == counter ? 0 : -1 ;
    }
}
