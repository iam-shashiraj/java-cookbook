package com.iamshashiraj.learn.solution;

import java.util.Scanner;

public class MaxSubArrayCount {
    public static void main(String[] args) {
        System.out.println("Enter num of elements: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] input = new int[num];


        for (int i=0; i < num; i++) {
            input[i] = scanner.nextInt();
        }
        // System.out.println(input);

        int cur_sum = input[0];
        int max_sum = input[0];

        for(int i = 1; i < num; i++) {
            cur_sum = Math.max(cur_sum + input[i], input[i]);//
            max_sum = Math.max(cur_sum, max_sum);
        }

        System.out.println("Max sum: " + max_sum);
    }
}
