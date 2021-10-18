package com.iamshashiraj.learn.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            if (map.get(str) == null) {
                //map.put(str, map.get(str))
            }
        }
    }

    static boolean checkAnagram(String a, String b) {
        boolean res = true;
        Map<Character, Integer> countMap1 = new HashMap<>();

        for(Character c: a.toCharArray()) {
            if (countMap1.get(c) == null) {
                countMap1.put(c, 1);
            } else {
                countMap1.put(c, countMap1.get(c)+1);
            }
        }
        Map<Character, Integer> countMap2 = new HashMap<>();
        for(Character c: a.toCharArray()) {
            if (countMap2.get(c) == null) {
                countMap2.put(c, 1);
            } else {
                countMap2.put(c, countMap2.get(c)+1);
            }
        }
        for(Character c: countMap1.keySet()) {
            if (countMap1.get(c) != countMap2.get(c)) {
                res = false;
                break;
            }
        }
        return countMap1.size() == countMap2.size() && res;
    }
}
