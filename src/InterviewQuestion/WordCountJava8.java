package InterviewQuestion;

import java.lang.management.ManagementPermission;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountJava8 {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language Java";
        Map<String,Long> wordCount = Arrays.stream(sentence.trim().split("\\s+")).collect(Collectors.groupingBy(s ->s,Collectors.counting()));

        System.out.println(wordCount);
    }
}
