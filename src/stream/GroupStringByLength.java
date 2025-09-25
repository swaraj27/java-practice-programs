package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group a list of strings based on their length.
public class GroupStringByLength {


    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Code", "Fun");
        Map<Integer,List<String>> wordLength = words.stream().collect(Collectors.groupingBy(String::length));

        System.out.println("word length " + wordLength);
    }

}
