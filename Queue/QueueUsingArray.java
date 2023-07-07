import java.util.Arrays;

import javax.print.DocFlavor.READER;

public class QueueUsingArray {
    public int[] Queuee;
    int F,R;
    QueueUsingArray(int items){
        Queuee = new int[items];
        F = 0;
        R = 0;
    }
    public static void main(String[] args) {
        QueueUsingArray qArray = new QueueUsingArray(5);
         qArray.enqueue(10);
         qArray.enqueue(20);
         qArray.enqueue(30);
         qArray.enqueue(40);
         qArray.enqueue(50);
         System.out.println(qArray.peek());
         //  System.out.println(qArray.front());
         //  System.out.println(qArray.rear());
         System.out.println(qArray.toString());
         qArray.dequeue();
         //  qArray.dequeue();
         //  qArray.dequeue();
         //  qArray.dequeue();
         //  qArray.dequeue();
         //  System.out.println(qArray.front());
         //  System.out.println(qArray.rear());
         System.out.println(qArray.toString());
         System.out.println(qArray.peek());
    }
    public void enqueue(int item){
        Queuee[R++] = item;
    }
    public int dequeue(){
        if(F==R)
        throw new IllegalStateException("Queue is empty");
        return Queuee[F++];
    }
    public int front(){
        return F;
    }
    public int rear(){
        return R;
    }

    public int peek(){
        return Queuee[F];
    }
    @Override
    public String toString(){
        var content = Arrays.copyOfRange(Queuee, front(),rear());
        return Arrays.toString(content);
    }
}
