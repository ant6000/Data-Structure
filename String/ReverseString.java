import java.util.Stack;
public class ReverseString
{
    public static void main(String[] args) {
        String rev = Reverse("hello ");
        System.out.println(rev);
    }

    // reverse string using stringbuilder 
    public static String Reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for(int i = str.length()-1; i >=0; i--)
            reversed.append(str.charAt(i));
    
        return reversed.toString();
    }

    // reverse string using stack
    public static String ReverseUstack(String input){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (var ch : input.toCharArray())
        stack.add(ch);

        while(!stack.empty())
            sb.append(stack.pop());

        return sb.toString();
    }
}