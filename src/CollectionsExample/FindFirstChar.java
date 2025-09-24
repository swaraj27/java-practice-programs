package CollectionsExample;

import java.util.HashMap;
import java.util.Map;

//Find First Non-Repeated Character in a String
public class FindFirstChar {
    public static void main(String[] args) {
        String str = "swiss";

        System.out.println("Get non repeated first char : "+findFirstNonRepeatedChar(str));
    }

    public  static Character findFirstNonRepeatedChar(String str){
        Map<Character,Integer> charCountMap = new HashMap<>();

        for(char c : str.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:charCountMap.entrySet()){

            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return null;
    }
}
