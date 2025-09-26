package stream;

import java.util.Arrays;
import java.util.List;

//Find the longest string in a list.
public class LongestStream {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "Stream", "API", "Development");
        String longestStream = words.stream()
                                .reduce((str1,str2) -> str1.length() > str2.length() ?str1:str2)
                                .toString();
        System.out.println("longest stream "+ longestStream);
    }
}
