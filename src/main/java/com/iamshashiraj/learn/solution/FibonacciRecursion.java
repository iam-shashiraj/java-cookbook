package com.iamshashiraj.learn.solution;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int input = 6;
        System.out.println(input + " fibonacci number is " + fibonacci(input));
        // 1 1 2 3 5 8
    }

    static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if(n == 2) {
            return 1;
        }
        return fibonacci(n-2) + fibonacci(n-1);
    }
}
