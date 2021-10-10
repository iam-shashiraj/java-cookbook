package com.iamshashiraj.learn.solution.arrays;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/*
    Given an array, ‘A’ of size N, its prefix sum array is an array of the same size N such that the ith element of the prefix sum array ‘Prefix’ is the sum of all elements of the given array till ith index from the beginning, i.e Prefix[i] = A[0] + A[1] + A[2] + … + A[i].
    For Example: Given A[] = [3, 4, -1, 2, 5], the prefix sum array P[] is given as -
    P[0] = 3, P[1] = 7, P[2] = 6, P[3] = 8, P[4] = 13
    i.e. P[] = [3, 7, 6, 8, 13]
 */
public class PrefixAndSuffixSumAray {
    public static void main(String[] args) {
        int [] number = {1, 2, 3};

        int [] prefixSumArray = new int[number.length];
        int [] suffixSumArray = new int[number.length];
        AtomicInteger sum = new AtomicInteger(0); AtomicInteger index = new AtomicInteger(0);
        IntStream.of(number).forEach((num) -> {
            prefixSumArray[index.getAndIncrement()] = sum.addAndGet(num);
        });
        // Arrays.stream(prefixSumArray).forEach(System.out::println);

        int sumSuffix = 0;
        for (int i=number.length-1; i>= 0; i--) {
            sumSuffix = sumSuffix + number[i];
            suffixSumArray[i] = sumSuffix;
        }

        Arrays.stream(suffixSumArray).forEach(System.out::println);
    }
}
