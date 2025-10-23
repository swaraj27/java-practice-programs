package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumVowels {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("stream", "java", "programming", "awesome");

        String maxVowels= words.stream().max(Comparator.comparingLong(MaximumVowels::countVowels)).orElse("");

        System.out.println("maxVowels "+ maxVowels);
    }

    private static long countVowels(String word){
        return word.chars().mapToObj(c->(char) c).filter(ch -> "aeiouAEIOU".indexOf(ch) != -1).count();
    }
}
