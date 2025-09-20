package leetcode;

public class ValidParentheses {
    public static void main(String args[]){

        String str = "[](){}";
        System.out.println("Result : "+validParenthesis(str));
    }

    public static  boolean validParenthesis(String str){
        while (true){
            if(str.contains("()")){
                str = str.replace("()","");
            } else if (str.contains("{}")) {
               str = str.replace("{}","");
            }else if(str.contains("[]")){
                str = str.replace("[]","");
            }else  return str.isEmpty();
        }
    };
}
