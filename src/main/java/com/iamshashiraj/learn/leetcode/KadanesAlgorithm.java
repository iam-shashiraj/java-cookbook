package com.iamshashiraj.learn.leetcode;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3, 4};
        int largestSumSubArray = Integer.MIN_VALUE;
        int currentMax = 0;
        for (int i=0; i<nums.length; i++) {
            currentMax += nums[i]; // -2 -3
            largestSumSubArray = Math.max(currentMax, largestSumSubArray); // -2
            if (currentMax < 0) {
                currentMax = 0;
            }
        }
        System.out.println(largestSumSubArray);
    }
}
