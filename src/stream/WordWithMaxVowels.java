package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WordWithMaxVowels {
    public static void main(String[] args) {
        //Find the word with the most vowels in a list.
        List<String> words = Arrays.asList("stream", "java", "programming", "awesome");

        String word = words.stream()
                     .max(Comparator.comparingLong(WordWithMaxVowels::countVowels))
                     .orElse("");
        System.out.println(word);
    }



    private static long countVowels(String word){
        return word.chars().filter(s -> "aeiouAIEOU".indexOf(s) != -1).count();
    }
}
