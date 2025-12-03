package InterviewQuestion;

import java.util.Stack;

public class BalancedExpression {
    public static void main(String[] args) {

        String expr1 = "[()]{}{()()}";
        String expr2 = "{[()()()}";
        String expr3 = "{)}";
        String expr4 = "()";

        System.out.println(expr1 + " → " + (isBalanced(expr1) ? "Balanced" : "Not Balanced"));
        System.out.println(expr2 + " → " + (isBalanced(expr2) ? "Balanced" : "Not Balanced"));
        System.out.println(expr3 + " → " + (isBalanced(expr3) ? "Balanced" : "Not Balanced"));
        System.out.println(expr4 + " → " + (isBalanced(expr4) ? "Balanced" : "Not Balanced"));
    }

    public static boolean isBalanced(String str){

        Stack<Character> stack = new Stack<>(); //{[()()()}

        for(char ch:str.toCharArray()){
            if(ch == '[' || ch=='(' || ch=='{'){
                stack.push(ch);
            }else if(ch == ']' || ch ==')'||ch=='}'){

                if(stack.empty()) return false;

                char top = stack.pop();
                        if((ch == ']') && top !='['
                        || (ch == ')') && top !='('
                        || (ch == '}') &&  top != '{'){
                    return false;
                }
            }

        }

        return stack.isEmpty();


    }
}
