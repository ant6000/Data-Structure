package StackProblems;
import java.util.Stack;

public class ReverseAString {

    public String StringReverser(String input){
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) 
            stack.push(ch);
        StringBuffer revString = new StringBuffer();
        while(!stack.isEmpty())
            revString.append( stack.pop());
             
        return revString.toString();
    }
    public static void main(String[] args) {
        // String input = "hello";
        // String rev= "";
        // Stack<Character> stack = new Stack<>();
        // for (char c : input.toCharArray()) {
        //     stack.push(c);
        // }
        // for (int i = 0; i < input.toCharArray().length ; i++) {
        //     rev = rev + stack.pop();
        // }
        // System.out.println(rev);

        ReverseAString reverser = new ReverseAString();
        var result = reverser.StringReverser("preonti");
        System.out.println(result);
    }
}
