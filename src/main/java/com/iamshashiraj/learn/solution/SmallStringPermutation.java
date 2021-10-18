package com.iamshashiraj.learn.solution;

import java.util.HashMap;
import java.util.Map;

public class SmallStringPermutation {
    public static void main(String[] args) {
        String smallString = "abc";
        String bigString = "abcabbacab";
        char[] big = bigString.toCharArray();
        char[] small = smallString.toCharArray();
        int count = 0;

        for (int i =0; i < bigString.length() - smallString.length() + 1; i++) {
            String currentWindow = bigString.substring(i, i+smallString.length());
            System.out.println(currentWindow);
            if (isPermutation(getCountMapFromString(smallString), getCountMapFromString(currentWindow))) {
                count++;
            }
        }

        System.out.println("Num of Permutations: " + count);
    }
    public static boolean isPermutation(Map<Character, Integer> smallMap, Map<Character, Integer> windowMap) {
        boolean result = true;
        for (Character key : smallMap.keySet()) {

            if (!smallMap.get(key).equals(windowMap.get(key))) {
                result = false;
            }
        }
        return result;
    }

    public static Map<Character, Integer> getCountMapFromString(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for(Character c : str.toCharArray()) {
            if(map.get(c) != null) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
