package stream;

import java.util.*;

public class DistinctCount {
    public static void main(String[] args) {

        List<String> sentences = Arrays.asList(
                "Java Stream API provides a fluent interface for processing sequences of elements.",
                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
                "In this exercise, you need to count the total number of words in all sentences."
        );

        Set<String> distinctWordsCount = new HashSet<>();

        for(String sentence : sentences){
            String words[] = sentence.split("\\W+");
            for(String word : words){
                if(!word.isEmpty()){
                    distinctWordsCount.add(word.toLowerCase());
                }
            }

        }

        System.out.println("distinct word count " + distinctWordsCount.size());

        long wordCount = sentences.stream()
                        .flatMap(s -> Arrays.stream(s.split("\\W+")))
                        .map(String::toLowerCase)
                        .distinct()
                        .count();
        System.out.println("wordCount "+wordCount);
    }
}
