package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CartesianProducts {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5);

        for(Integer ls : list1){
            for (Integer ls2 : list2){
                System.out.println("( " + ls + ", "+ ls2 + " )");
            }
        }

        List<String> cartesianProduct = list1.stream()
                                        .flatMap(i ->  list2.stream()
                                                .map(j -> "( " + i+ " ,"+ j +" )"))
                                        .collect(Collectors.toList());
        System.out.println("Cartesian Product "+ cartesianProduct);
    }
}
