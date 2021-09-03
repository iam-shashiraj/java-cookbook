package com.iamshashiraj.learn.feature;

import java.io.InputStream;
import java.util.Scanner;

public class ArrayListLinkedListExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while(num > 0) {
            printFizzBuzz(num, n -> n % 5 == 0 && n % 3 == 0);
            num --;
        }


    }
    public interface SolveFizzBuzz {
        boolean solve(Integer i);
    }

    static void printFizzBuzz(Integer num, SolveFizzBuzz s) {
        s.solve(num);
    }
}
