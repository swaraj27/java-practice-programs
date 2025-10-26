package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Compute running sum
public class RunningSum {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        List<Integer> sum = numbers.stream().map()

        List<Integer> sum = new ArrayList<>();

        int prev =0;
        for(int i=0; i < numbers.size(); i++){
            if(i==0){
                sum.add(numbers.get(i));
                prev = numbers.get(i);
            }else{
                int addd = prev + numbers.get(i);
                prev = addd;
                sum.add(addd);
            }
        }
        System.out.println("Running sum " + sum);

        List<Integer> sumUsingStream = IntStream.range(0, numbers.size())
                .mapToObj(i -> numbers.subList(0,i+1).stream()
                        .mapToInt(Integer::intValue).sum())
                        .collect(Collectors.toList());
        System.out.println(sumUsingStream);
    }

}
