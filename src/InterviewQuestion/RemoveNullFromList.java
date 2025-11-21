package InterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullFromList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("swaraj",null,"pawar",null);
        List<String> updatedList = list.stream().filter(s -> s != null).collect(Collectors.toList());
        System.out.println(updatedList);
    }
}
