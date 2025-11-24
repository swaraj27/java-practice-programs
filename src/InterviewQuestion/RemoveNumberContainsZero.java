package InterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNumberContainsZero {
    public static void main(String[] args) {

        int arr [] = {567,234,605,600,7007,8760};

        List<String> sortedAr =  Arrays.stream(arr)
                .filter(s -> !String.valueOf(s).contains("0"))
                .sorted().mapToObj(String::valueOf).collect(Collectors.toList());
        System.out.println("sorted ar "+ sortedAr);

    }
}
