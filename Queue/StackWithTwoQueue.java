import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class StackWithTwoQueue {
    
    Queue<Integer> queue1 ; 
    Queue<Integer> queue2 ;
    StackWithTwoQueue(){
        queue1 = new ArrayDeque<>();
        queue2 = new ArrayDeque<>();
    }
    public  void push(int item){
            queue2.add(item);
            while(!queue1.isEmpty()){
                queue2.add(queue1.peek());
                queue1.remove();
            }
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;

    }

    public int pop(){
        if(queue1.isEmpty()){
            throw new IllegalStateException();
        }
        return queue1.remove();
    }
    public static void main(String[] args) {
        StackWithTwoQueue stack = new StackWithTwoQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.queue1);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.queue1);

    }
}
