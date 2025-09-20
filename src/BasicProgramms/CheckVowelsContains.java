package BasicProgramms;

public class CheckVowelsContains {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("check vowel "+ checkStringContainsVowel(str));
    }
    public static boolean checkStringContainsVowel(String str){

        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
