package com.iamshashiraj.learn.solution;

// pair sum in sorted distinct array
public class PairSum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 8};
        int[][] output = new int[7][2];
        int k = 5;
        int low = 0;
        int high = (numbers.length) - 1;

        while (low < high) {
            if ((numbers[low] + numbers[high]) < k) {
                low ++;
            } else if (numbers[low] + numbers[high] > k) {
                high --;
            } else {
                System.out.print(low + "--");
                System.out.println(high);
                low++;
                high--;
            }
        }
    }
}
