import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class queue {
    public static void main(String[] args) 
    {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        var top = queue.remove();
        System.out.println(top);
        System.out.println(queue);
    }
}
