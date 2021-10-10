package com.iamshashiraj.learn.model;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {
    int top = -1;
    Queue<Integer> s;

    public StackUsingQueue() {
        top = -1;
        s = new ArrayDeque<>();
    }

    public void push(int a) {
        top++;
        s.add(a);
    }

    public int pop(){
        top--;
        return s.remove();
    }

    public int size() {
        return top+1;
    }
}
