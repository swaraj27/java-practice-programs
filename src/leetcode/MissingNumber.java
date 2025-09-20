package leetcode;

public class MissingNumber {



    public static int findMissingNumber(int num[]){
        int n  = num.length;
        int expectedSum  = n * (n+1) /2;
        int actualSum = 0;
        for(int no :num){
            actualSum += no;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int arr[] = {2,0,3};
       System.out.println(findMissingNumber(arr));
    }
}
