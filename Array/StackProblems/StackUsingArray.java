package StackProblems;

import java.util.Arrays;
import java.util.Stack;

public class StackUsingArray {
    // push
    // pop
    // peek
    // isEmpty
    int[] ArrayStack;
    int count;

    public StackUsingArray(int items) {
        ArrayStack = new int[items];
        count = 0;
    }

    public void push(int item) {
        if (count == ArrayStack.length)
            throw new StackOverflowError("Stack is full");

        ArrayStack[count++] = item;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalStateException("Stack is empty");

        return ArrayStack[--count];
    }

    public int peek() {
        if(count == 0)
        throw new IllegalStateException("count 0", null);
        return ArrayStack[count - 1];
    }

    public boolean isEmpty(){
        return count== 0;
    }
    @Override
    public String toString() {
        var content = Arrays.copyOfRange(ArrayStack, 0, count);
        return Arrays.toString(content);
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        var top = stack.peek();
        System.out.println(top);
        System.out.println(stack.toString());
        // System.out.println(Arrays.toString(stack));
    }
}
