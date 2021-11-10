package com.iamshashiraj.learn.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TopKFrequentElements {
     static public void main(String[] args) {
        int [] nums = {0, 0, 0, 0, 0, 0, 1, 2, 2, 4, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3};
        int k = 2;
        int j = 0;
        int [] result = new int[k];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i< nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        Map<Integer, Integer> res = new TreeMap<>(Collections.reverseOrder());

        for(Integer key: map.keySet()) {
            res.put(map.get(key), key);
        }
        for(Integer key: res.keySet()) {
            System.out.println(key + " -> " + res.get(key));
        }
        for(Integer key: res.keySet()) {
            result[j++] = res.get(key);
            if (j == k ) {
                break;
            }
        }

        for (int i =0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
