package StackProblems;

import java.util.Stack;

public class NewStack {
    
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        stack.push(30);
        stack.push(20);
        stack.push(50);
        stack.push(70);
        stack.push(90);
        System.out.println(stack);
        int top = stack.peek();
        System.out.println(top);
        System.out.println(stack);
    }
}

