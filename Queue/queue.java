import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class queue {
    public static void main(String[] args) 
    {
        Queue<Integer> queue = new ArrayDeque<>();
        reverse(queue);
    }

    public static void reverse(Queue<Integer> queue2){
        //add
        //remove
        //isEmpty
        Stack<Integer>stack = new Stack<>();
        queue2.add(10);
        queue2.add(20);
        queue2.add(30);
        queue2.add(40);
        System.out.println(queue2);
        while(!queue2.isEmpty()){
            stack.add(queue2.remove());
        }
        System.out.println(stack);
        while(!stack.isEmpty()){
            queue2.add(stack.pop());
        }


    }
}
