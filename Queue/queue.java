import java.util.ArrayDeque;
import java.util.Queue;

public class queue {
    public static void main(String[] args) 
    {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue.size());
    }
}
