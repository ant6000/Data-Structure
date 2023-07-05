package StackProblems;

import java.util.Arrays;

public class TwoStackinOneArray {
    int[] Stack;
    int top1;
    int top2;

    public TwoStackinOneArray(int capacity) {
        Stack = new int[capacity];
        top1 = 0;
        top2 = capacity;
    }

    public void push1(int item) {
        if (top1 == top2)
            throw new IllegalStateException("stack1");

        Stack[top1++] = item;
    }

    public void push2(int item) {
        if (top1 == top2)
            throw new IllegalStateException("stack2");

        top2--;
        Stack[top2] = item;
    }


    public boolean isEmpty1() {
        return top1 == 0;
    }

    public boolean isEmpty2() {
        return top2 == Stack.length;
    }

    // @Override
    // public String toString(){
    // var content1 = Arrays.copyOfRange(Stack, 0, top1);
    // return Arrays.toString(content1);
    // }
    @Override
    public String toString() {
        var content2 = Arrays.copyOfRange(Stack, top1, Stack.length);
        return Arrays.toString(content2);
    }

    public static void main(String[] args) {
        TwoStackinOneArray stackinOneArray = new TwoStackinOneArray(6);
        stackinOneArray.push2(11);
        stackinOneArray.push2(7);
        stackinOneArray.push2(8);
        stackinOneArray.push2(9);
        stackinOneArray.push2(9);
        stackinOneArray.push2(9);
        System.out.println(stackinOneArray.toString());
    }

}
