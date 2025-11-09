package BasicProgramms;

public class SquareOfNumberWithoutLoop {

    public static void main(String[] args) {
        int num = 5 ;
        System.out.println(squareOfNum(num));
    }

    public static int squareOfNum (int n){
        if(n < 0) n = -n;

        if(n == 0){
            return 0;
        }

        // Recursive relation: n^2 = (n-1)^2 + 2*(n-1) + 1
        return squareOfNum(n - 1) + (n << 1)-1; // (n << 1) is 2*n using bitwise shift
    }
}
