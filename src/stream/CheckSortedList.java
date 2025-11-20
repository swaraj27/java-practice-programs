package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CheckSortedList {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 4, 3, 5);
        System.out.println(" check sorted or not : " + checkSortedOrNot(numbers));

        System.out.println(" check stream api  : " + checkUsingStream(numbers));

    }

    public static boolean checkSortedOrNot(List<Integer> numbers){
        boolean flag = false;
        for(int i = 0; i < numbers.size() - 1; i ++){
            if(numbers.get(i+ 1) - numbers.get(i) == 1 ){
                flag = true;
            }else {
                flag = false;
            }
        }
        return flag;
    }

    public  static boolean checkUsingStream(List<Integer> numbers){
        return IntStream.range(1, numbers.size()).allMatch( s -> numbers.get(s) >= numbers.get(s - 1));
    }
}
