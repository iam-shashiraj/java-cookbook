package com.iamshashiraj.learn.solution;

import java.util.Scanner;

public class MaxSubArrayCount {
    public static void main(String[] args) {
        int [] input = {1, 2, 7, -4, 3, 2, -10, 9, 1};

        int cur_sum = input[0];
        int max_sum = input[0];

        for(int i = 1; i < input.length; i++) {
            cur_sum = Math.max(cur_sum + input[i], input[i]);//
            max_sum = Math.max(cur_sum, max_sum);
        }

        System.out.println("Max sum: " + max_sum);
    }
}
