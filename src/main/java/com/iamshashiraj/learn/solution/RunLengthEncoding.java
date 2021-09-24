package com.iamshashiraj.learn.solution;

import java.lang.reflect.Array;
import java.util.*;

public class RunLengthEncoding {
    public static void main(String[] args) {
        System.out.println("Please enter input string");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int inputLength = input.length();
        char prev = input.charAt(0);
        int counter = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < inputLength; i++) {
            char current = input.charAt(i);
            if (prev == current) {
                counter ++;
            } else {
                sb.append(counter).append(prev);
                prev = current;
                counter = 1;
            }
        }
        sb.append(counter).append(input.charAt(inputLength-1));
        System.out.println(sb);
    }
}
