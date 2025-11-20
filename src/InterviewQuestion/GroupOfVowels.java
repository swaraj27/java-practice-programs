package InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupOfVowels {
    public static void main(String[] args) {
       List<String> strList =  Arrays.asList("cat", "bat", "hat", "mate", "bee", "tree") ;

        System.out.println(countVowels("mate"));
        Map<Integer,List<String>>  groupOfVowels  = strList.stream() // find the string with count of vowels
                                                    .collect(Collectors.groupingBy(s->countVowels(s)));

        System.out.println(groupOfVowels);
        List<List<String>> vowelsList = new ArrayList<>(groupOfVowels.values());
        System.out.println(vowelsList);
    }

    private static int countVowels(String word){
        return (int) word.chars()
                .filter(s -> "aeiouAEIOU".indexOf(s) != -1)
                .count();
    }
}
