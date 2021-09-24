package com.iamshashiraj.learn.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ArraysUtilsExamples {
    public static void main(String[] args) {
        // create list of numbers
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        // get array from list
        Integer[] numsFromList = nums.toArray(new Integer[nums.size()]);

        // Arrays.stream(numsFromList).forEach(System.out::print);

        int[] numAr = {1, 2, 5, 4, 0, 7};

        IntStream.of(numAr).boxed().sorted().forEach(System.out::println);
        Arrays.sort(numsFromList, Collections.reverseOrder());
        // binary search
        System.out.println(Arrays.binarySearch(numAr, 7));

    }
}
