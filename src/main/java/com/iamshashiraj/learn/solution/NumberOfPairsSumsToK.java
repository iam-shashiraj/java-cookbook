package com.iamshashiraj.learn.solution;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberOfPairsSumsToK {
    public static void main(String[] args) {
        int[] input = {1, 3, 5, 4, 2,  8, 10};
        int k = 2;
        int resultCount = 0;
        Arrays.sort(input);
        // IntStream.of(input).forEach(System.out::println);

        System.out.println(IntStream.of(input).filter(num -> {
            boolean val = binarySearch(input, num-k);
            if (val) {
                System.out.println( ":" + num);
            }
            return val;
        }).count());

    }

    private static boolean binarySearch(int[] numbers, int key){
        //IntStream.of(numbers).forEach(System.out::println);
        boolean res = false;
        int low =0;
        int high = numbers.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (key == numbers[mid]) {
                System.out.print(key);
                res = true;
                return true;
            } else if (key > numbers[mid]) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return res;
    }
}
