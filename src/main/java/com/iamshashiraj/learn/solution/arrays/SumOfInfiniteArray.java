package com.iamshashiraj.learn.solution.arrays;

import java.util.ArrayList;
import java.util.List;

/*
    Given an array “A” of N integers and you have also defined the new array “B” as a concatenation of array “A” for an infinite number of times.
    For example, if the given array “A” is [1,2,3] then, infinite array “B” is [1,2,3,1,2,3,1,2,3,.......].
    Now you are given Q queries, each query consists of two integers “L“ and “R”. Your task is to find the sum of the subarray from index “L” to “R” (both inclusive) in the infinite array “B” for each query.
 */
public class SumOfInfiniteArray {
    public static void main(String[] args) {

        int [] numbers = {1, 3, 5, 7};
        int l= 102; int r = 105;

        int [] chunk = new int[r-l];
        int sum =0;
        for (int i = l; i < r; i++) {
            sum  = sum + numbers[i%numbers.length];
        }
        System.out.println(sum);
    }
}
