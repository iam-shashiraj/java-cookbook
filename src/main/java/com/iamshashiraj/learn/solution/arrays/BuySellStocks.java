package com.iamshashiraj.learn.solution.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuySellStocks {
    public static void main(String[] args) {
        int[] prices = {12, 6, 4, 5, 7, 9, 10};
        int lastPrice = prices[0];
        List<Integer> nums = new ArrayList<>();
        for(int i=1; i<prices.length; i++) {
            if (lastPrice > prices[i]) {
                lastPrice = prices[i];
                continue;
            } else {
                nums.add(prices[i]);
            }
        }
    }

    static int findIndex(int[] nums, int num) {
       return Arrays.asList(nums).indexOf(num);
    }
}
