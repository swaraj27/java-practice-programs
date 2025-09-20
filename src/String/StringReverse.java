package String;

public class StringReverse {
    public static void main(String[] args) {
        String str = "swaraj";
        char chars[] = str.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for(int i = chars.length - 1; i >= 0; i--){
            reverse.append(chars[i]) ;
        }

        System.out.println("Reverse : "+reverse);

    }
}
