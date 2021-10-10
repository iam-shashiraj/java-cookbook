package com.iamshashiraj.learn.solution;

import com.iamshashiraj.learn.model.StackUsingQueue;

public class StackUsingQueueExample {
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(15);
        System.out.println(stack.size());
        System.out.println(stack.pop());
    }
}
