import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);
    }

    private static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty())
        stack.push(queue.remove());
        while(!stack.isEmpty())
        queue.add(stack.pop());
    }
}
