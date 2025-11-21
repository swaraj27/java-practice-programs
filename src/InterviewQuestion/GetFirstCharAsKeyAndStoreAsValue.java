package InterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetFirstCharAsKeyAndStoreAsValue {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cat","anjir","ant");

        Map<Character,String> storeKV = list.stream()
                                        .collect(Collectors.toMap(s -> s.charAt(0),
                                                                    s ->s,
                                                                    (v1,v2) -> v1 + "," + v2));
        System.out.println(storeKV);

        Map<Character,List<String>> keyValue = list.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(keyValue);

    }
}
