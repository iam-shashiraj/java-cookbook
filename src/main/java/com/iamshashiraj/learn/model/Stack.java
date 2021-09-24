package com.iamshashiraj.learn.model;

import java.util.ArrayList;

public class Stack {
    int top;
    ArrayList<Integer> s;

    public Stack() {
        top = -1;
        s = new ArrayList<>();
    }

    public void push(int val) {
        top ++;
        s.add(top, val);
    }

    public int pop() {
        int val = s.get(top);
        s.set(top, -1);
        top--;
        return val;
    }

    public int getStackSize() {
        return top + 1;
    }
}
