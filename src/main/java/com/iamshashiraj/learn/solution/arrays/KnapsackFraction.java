package com.iamshashiraj.learn.solution.arrays;

import java.util.Arrays;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class KnapsackFraction {
    public static void main(String[] args) {
        int numOfItems = 7;
        int[] weights = {2, 3, 5, 7, 1, 4, 1};
        int[] profits = {10, 5, 15, 7, 6, 18, 3};
        int knapsackCapacity = 17;
        int currentCapacity = 0;
        int totalProfit = 0;

        double [] profitByWeight = new double[numOfItems];
        // Arrays.fill(profitByWeight, -1);
        // printArray(profitByWeight);

        Arrays.sort(profitByWeight);

        TreeMap<Double, Integer> profitByWeightProfitMap = new TreeMap<>();

        for(int i=0; i < numOfItems; i++) {
            profitByWeightProfitMap.put((double) profits[i] / (double) weights[i], profits[i]);
        }

        NavigableMap descMap = profitByWeightProfitMap.descendingMap();

        for(Object ratio: descMap.keySet()) {
            Double currentProfitByWeight = (Double)ratio;
            System.out.println("Current weight: " + (1/currentProfitByWeight)*profitByWeightProfitMap.get(ratio));
            System.out.println("Current profit: " + profitByWeightProfitMap.get(ratio));
            currentCapacity += (1/currentProfitByWeight)*profitByWeightProfitMap.get(ratio);
            if(currentCapacity <  knapsackCapacity) {
                totalProfit += profitByWeightProfitMap.get(ratio);
            } else {
                currentCapacity = (int) (currentCapacity - (1/currentProfitByWeight)*profitByWeightProfitMap.get(ratio));
            }
        }
        System.out.println(currentCapacity);
        System.out.println(totalProfit);



    }
    static void printArray(int [] arr) {
        IntStream.of(arr).forEach(System.out::print);
    }
}
