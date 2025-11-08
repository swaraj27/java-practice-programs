package InterviewQuestion;

import java.util.*;

public class GroupAnagram {

    //Given an array of strings, group the anagrams together.
    //An anagram is formed by rearranging the letters of a word.
    //
    //Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
    //Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
    //
    //String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();
        // sort string in ascending order
        for(String str : strs){
            char arr [] = str.toCharArray();
            Arrays.sort(arr);
            String asc = arr.toString();
            map.computeIfAbsent(asc,k -> new ArrayList<>()).add(str) ;
        }
    }
}
