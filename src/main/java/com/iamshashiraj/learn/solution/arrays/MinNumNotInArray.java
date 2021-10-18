package com.iamshashiraj.learn.solution.arrays;

/*
This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

import java.util.Arrays;

public class MinNumNotInArray {
    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        int min = 1;
        Arrays.sort(A);

        for(int i = 0; i< A.length -1; i++) {
            if (A[i] <= 0) {
                continue;
            } else {
                int j = i+1;
                if (A[j] - A[i] != 1) {
                    min = A[i] + 1;
                }
                if (j == A.length -1 && min == 1){
                    min = A[j] +1;
                }
            }

        }
        System.out.println("Min: " + min);
    }
}
