package InterviewQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Reverse : "+ reverseNumber(2123));
    }

    public static int reverseNumber(int number){
        int reversed = 0;

        while (number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number /10;
        }
        return reversed;
    }
}
