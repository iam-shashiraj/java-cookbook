package com.iamshashiraj.learn.solution.arrays;

public class IsAPowerOfTwo {
    public static void main(String[] args) {
        int num = 258;
        double current = num;

        while(true) {
            current = current / 2;
            if (current == 1) {
                System.out.println("yes power of two");
                break;
            }
            if (current < 1) {
                System.out.println("not power of two");
                break;
            }
        }
    }
}
