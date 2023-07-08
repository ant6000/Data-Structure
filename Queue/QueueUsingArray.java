import java.util.Arrays;

public class QueueUsingArray {
    public int[] items;
    int front, rear, count;
    QueueUsingArray(int capacity){
        items = new int[capacity];
        front = 0;
        rear = 0;
    }
    public static void main(String[] args) {
        QueueUsingArray qArray = new QueueUsingArray(5);
        System.out.println(qArray.count);
    }

    public void enqueue(int item){
        if(count == items.length)
        throw new IllegalStateException();
        items[rear] = item;
        rear = (rear+1) % items.length;
        count++;
    }

    public int dequeue(){
        int item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

}
