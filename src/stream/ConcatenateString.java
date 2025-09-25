package stream;

import java.util.Arrays;
import java.util.List;
// Concatenate all strings in a list into a single string.
public class ConcatenateString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Stream", "API", "is", "powerful");

        String str = "";
        for (String strn : words){
            str += strn + " ";
        }
        System.out.println(str);

        //Using stream api
        String finalString = words.stream().reduce("",(s1,s2) -> s1+" "+s2).trim();
    }
}
