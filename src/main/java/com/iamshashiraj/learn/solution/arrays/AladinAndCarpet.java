package com.iamshashiraj.learn.solution.arrays;

import java.util.stream.IntStream;
/*
    description here https://medium.com/beyond-programming/alaaddin-and-his-carpet-algorithm-problem-of-the-week-i-8b4e39cc13bb
 */
public class AladinAndCarpet {
    public static void main(String[] args) {
        int[] magic = {3, 2, 5, 4};
        int[] dist = {3, 3, 4, 2};

        int magicSum = IntStream.of(magic).sum();
        int distSum = IntStream.of(dist).sum();
        if (distSum > magicSum) {
            System.out.println("Not enuf magic to travel all path");
        }

        int totalValue = 0;
        int startIndex = 0;
        int length = magic.length;

        for (int i = 0; i < length; i++) {

            if (totalValue < 0) {
                startIndex = i;
                totalValue = 0;
            }
            totalValue += (magic[i] - dist[i]);

        }
        System.out.println(startIndex);
    }
}
