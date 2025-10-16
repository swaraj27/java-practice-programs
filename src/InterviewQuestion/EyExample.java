package InterviewQuestion;

public class EyExample {

    //Find second smallest element in an array. If none return -1. No stream methods and no collection class to be used
    //
    //int arr=[4,6,3,10,14]    //Find second smallest element in an array. If none return -1. No stream methods and no collection class to be used
    //

    public  static int secondSmallestElement (int arr[]){
        int smallElement = 0;
        if(arr.length < 2 || arr == null){
            return -1;
        }
        //[4,6,3,10,14]
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int num : arr){

            if(num < smallest){
                secondSmallest = smallest;
                smallest = num;
            }else if(num < secondSmallest && num != smallest){
                secondSmallest = num;
            }

        }

        return  secondSmallest;

    }
    public static void main(String[] args) {
        int[] arr1 =  {4,6,3,10,14};


        int secondSmall = secondSmallestElement(arr1);
        System.out.println("second smallest num : "+ secondSmall);


        //Find missing number in a array which is sorted and do not have duplicates
        //Eg int[] arr={2,3,5,6};
        //
        

        int [] arr = {2,3,5,6};
        for(int i=0; i < arr.length - 1; i++){
            if (arr[i+1] - arr[i] != 1) {
                int finalNum = arr[i] + 1;
                System.out.println("missing num "+ finalNum);
            }
        }
    }
}
