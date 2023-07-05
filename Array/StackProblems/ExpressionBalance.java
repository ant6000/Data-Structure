package StackProblems;

import java.util.Stack;

public class ExpressionBalance {
    public boolean balance(String inpuString) {
        Stack<Character> stack = new Stack<>();
        for (char ch : inpuString.toCharArray()) {
            if (isLeftBrakets(ch))
                stack.push(ch);

            if (isRightBrakets(ch)) {
                if (stack.empty()) return false;

                var top = stack.pop();
                if(braketsMatch(top, ch)) return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        ExpressionBalance balance = new ExpressionBalance();
        var result = balance.balance("{[(1+2)]}");
        System.out.println(result);
    }

    private boolean isLeftBrakets(char c){
        return c == '(' || c == '[' || c == '{';
    }
    private boolean isRightBrakets(char c){
        return c == ')' || c == ']' || c == '}';
    }
    private boolean braketsMatch( char left, char right){
        return (right == ')' && left != '(') ||
               (right == ']' && left != '[') ||
               (right == '}' && left != '{') ;
    }
}
