package InterviewQuestion;

import java.util.Arrays;

public class SecondPositionElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1};

        int second = Arrays.stream(arr).skip(1).findFirst().orElseThrow(null);
        System.out.println(second);
    }
}
