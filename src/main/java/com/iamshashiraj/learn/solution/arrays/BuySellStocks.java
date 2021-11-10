package com.iamshashiraj.learn.solution.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuySellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3 , 6, 4};
        int maxProfit = 0;
        int currentMin = Integer.MAX_VALUE;
        for (int i=0; i < prices.length; i++) {
            currentMin = Math.min(currentMin, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - currentMin);
        }
        System.out.println(maxProfit);
    }


}
