import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class QueueReverser{
    public static void reverse(Queue<Integer> queue, int k){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< k; i++)
        stack.push(queue.remove());

        while(!stack.isEmpty())
        queue.add(stack.pop());

        for(int i = k; i < queue.size(); i++)
        queue.add(queue.remove());
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        reverse(queue, 4);
        System.out.println(queue);
    }
}