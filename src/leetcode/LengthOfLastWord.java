package leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println(findLengthOfLastWord(str));

    }

    public static int findLengthOfLastWord(String str){
 
        String strArr[] = str.trim().split("\\s+");
        int last  = strArr.length - 1;
        return strArr[last].length();
    }
}
