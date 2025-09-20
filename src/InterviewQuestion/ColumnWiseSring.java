package InterviewQuestion;

public class ColumnWiseSring {
    public static void main(String[] args) {
        String arr [] = {"Mumbai","Pune","Chennai","Bengluru"};

        //find longest string length
        int maxLen = 0;
        for(String str: arr){
            maxLen = Math.max(maxLen, str.length());
        }

        //build String column wise
        for(int i=0; i<maxLen; i++){
            StringBuilder sb = new StringBuilder();
            for(String s :arr){
                if(i < s.length()){ //avoid array index out of bound
                    sb.append(s.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
