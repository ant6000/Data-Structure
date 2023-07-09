import java.util.PriorityQueue;

public class PriorityQueuee {
    public static void main(String[] args) {
    PriorityQueue<Integer> myqueue = new PriorityQueue<>();
    myqueue.add(10);
    myqueue.add(3);
    myqueue.add(15);
    myqueue.add(20);
    myqueue.add(11);
    myqueue.add(1);
    System.out.println(myqueue);
    while(!myqueue.isEmpty())
    System.out.print(" "+ myqueue.remove());
    }
}
