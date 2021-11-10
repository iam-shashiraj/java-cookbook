package com.iamshashiraj.learn.solution;

// print 1 to 100 without loop
public class PrintNumbersWithoutLoop {
    public static void main(String[] args) {
        printNumbers(1);
    }

    private static void printNumbers(int i) {
        if (i == 101) {
            return;
        }
        System.out.println(i);
        printNumbers(i+1);
    }
}
