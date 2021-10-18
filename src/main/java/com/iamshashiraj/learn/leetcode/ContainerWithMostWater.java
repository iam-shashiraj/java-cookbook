package com.iamshashiraj.learn.leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] input = {1,8,6,2,5,4,8,3,7};
        System.out.println("ContainerWithMostWater: " + bruteForce(input));

        System.out.println("O(n) solution: " + bestSolution(input));
    }

    static int bruteForce(int[] numbers) {
        int max = 0;
        for (int i=0; i < numbers.length -1; i++ ) {
            for (int j=i+1; j < numbers.length; j++ ) {
                int horizontalDiff = j -i;
                int verticalDiff = Math.min(numbers[i], numbers[j]);
                int currentMax = horizontalDiff*verticalDiff;
                //System.out.println(currentMax);
                max = Math.max(max, currentMax);
            }
        }
        return max;
    }

    static int bestSolution(int[] numbers) {

        int max = 0;
        int n = numbers.length;
        int left = 0;
        int right =n-1;

        while(left<right) {
            int horizontalDiff = right-left;
            int verticalDiff = Math.min(numbers[left], numbers[right]);
            int currentMax = horizontalDiff*verticalDiff;
            max = Math.max(max, currentMax);
            if (numbers[left] < numbers[right]) {
                left++;
            } else {
                right --;
            }
        }

        return max;
    }

}
