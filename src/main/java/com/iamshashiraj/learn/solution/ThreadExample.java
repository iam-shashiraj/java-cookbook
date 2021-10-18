package com.iamshashiraj.learn.solution;

public class ThreadExample {
    static int count = 0;
    public static void main(String[] args) {
        while(true) {
            incrementCounter();
            System.out.println("incrementing");
            incrementCounter();
        }

    }
    private static void incrementCounter() {
            System.out.println("current count is "+ ++count);
    }
}
