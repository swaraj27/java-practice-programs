package stream;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        IntStream randNum = random.ints(10,0,100);
        randNum.forEach(System.out::println);
    }
}
