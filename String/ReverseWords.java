import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {
    public static void main(String[] args) {
        String str = reverseWords("hello i am antor chakraborty");
        System.out.println(str);
    }
    public static String reverseWords(String input){
        String[] words = input.split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words); 
        // StringBuilder reversed = new StringBuilder();
        // for( var i = words.length-1; i >= 0; i--)
        // reversed.append(words[i]+ " ");
        // return reversed.toString().trim();
    }
}
