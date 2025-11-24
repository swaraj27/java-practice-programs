package InterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntersectionOfTwoList {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 2);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 2);

        List<Integer> interSection  = list1.stream().filter(list2::contains).collect(Collectors.toList());

        System.out.println("Intersection  "+ interSection);

        List<Integer> union = Stream.concat(list1.stream(),list2.stream()).distinct().collect(Collectors.toList());
        System.out.println("union : "+ union);

    }
}
