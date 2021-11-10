package com.iamshashiraj.learn.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindIfPathExistsInGraph {
    public static void main(String[] args) {
        Integer[] arr1 ={0, 1};
        Integer[] arr2 ={1, 2};
        Integer[] arr3 ={2, 0};
        Integer[] arr4 ={2, 4};
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(arr1));
        edges.add(Arrays.asList(arr2));
        edges.add(Arrays.asList(arr3));
        edges.add(Arrays.asList(arr4));

        System.out.println(edges);

        String m = "rajdgr8";
        System.out.println(m.replaceAll("[^a-zA-Z]", ""));
        char[] charar = m.toCharArray();
        Arrays.sort(charar);
        System.out.println(charar);

        System.out.println(Arrays.binarySearch(charar, 'q'));

    }
}
