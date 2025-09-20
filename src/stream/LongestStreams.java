package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStreams {
    public static void main(String[] args) {

        List<String> str = Arrays.asList("banana","apple", "chery","date","grapefruits");
        Optional<String> maxStr = str.stream().max(Comparator.comparingInt(String::length));
        System.out.println(maxStr);

        String longestString = "";
        for (String st:str){
            if (st != null && st.length() > longestString.length()){
                longestString = st;
            }
        }
        System.out.println("Longest STR "+longestString);
    }
}
