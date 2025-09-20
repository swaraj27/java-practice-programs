package BasicProgramms;

public class SwapTwoNumbers {
    public static void main(String[] args) {
    //logic
        /* a=4,b=8
        *   b = b+a
        *   a = b-a
        *   b = b-a
        * */

        int a =4, b=8;
        b = b+a;
        a = b-a;
        b=  b-a;
        System.out.println("a = "+ a + " b = "+ b);
    }
}
