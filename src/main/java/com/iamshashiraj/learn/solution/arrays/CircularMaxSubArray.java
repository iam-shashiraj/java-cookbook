package com.iamshashiraj.learn.solution.arrays;

public class CircularMaxSubArray {
    public static void main(String[] args) {
        int[] input = { 3, -7, 5, 6};

        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;
        int currentMax = 0;
        int currentMin = 0;
        int arraySum = 0;

        for (Integer num: input) {
            arraySum += num;
            currentMax += num;
            currentMin += num;
            maxCount = Math.max(maxCount, currentMax);
            if (currentMax < 0) {
                currentMax = 0;
            }

            minCount = Math.min(minCount, currentMin);
            if (currentMin > 0) {
                currentMin = 0;
            }
        }
        System.out.println(arraySum);
        System.out.println(maxCount);
        System.out.println(minCount);

        if (arraySum == minCount) {
            System.out.println(maxCount);
        } else {
            System.out.println(arraySum-minCount);
        }
    }
}
