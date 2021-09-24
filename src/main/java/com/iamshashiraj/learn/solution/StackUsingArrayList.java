package com.iamshashiraj.learn.solution;

import com.iamshashiraj.learn.model.Stack;

public class StackUsingArrayList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(5);
        stack.push(15);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(100);
        System.out.println(stack.getStackSize());
    }
}
