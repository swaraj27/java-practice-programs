import java.util.*;

public class WordsFrequency {
    public static void main(String[] args) {

        String sentence = "Java is powerful and Java is simple";

        String words[] = sentence.trim().toLowerCase().split("\\s+");

        Map<String,Integer> wordMap = new HashMap<>();

        for(String word:words){
            word = word.replaceAll("[^a-z]]","");
            if(!word.isEmpty()){
                wordMap.put(word,wordMap.getOrDefault(word,0)+1);
            }
        }
        System.out.println("Word count "+words.length);
        System.out.println("word frequency "+wordMap);
    }
}
