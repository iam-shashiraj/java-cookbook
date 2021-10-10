package com.iamshashiraj.learn.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallestSubStringContainingAllChars {

    public static void main(String[] args) {

        String subString = getSmallestSubStringWithAllChars("shashash");
        System.out.println("output : " + subString);

    }

    private static String getSmallestSubStringWithAllChars(String input) {
        if (input.length() <= 1) {
            return input;
        }
        Map<Character, Integer> sizeMap = new HashMap<>();

        String smallestSubstring = input;
        Integer currentSmallCount = Integer.MAX_VALUE;

        for(Character c: input.toCharArray()) {
            if (sizeMap.get(c) == null) {
                sizeMap.put(c,1);
            } else {
                sizeMap.put(c, sizeMap.get(c)+1);
            }
        }
        int distinctCharCount = sizeMap.size();

        for(int i=0; i< input.length(); i++) {
            for (int j=i+1;j <= input.length(); j++) {
                String currentSubString = input.substring(i, j);
                System.out.println(currentSubString);
                boolean doesHaveAll = isCurrentStringHasAllChars(currentSubString, sizeMap);
                System.out.println( doesHaveAll);
                if(doesHaveAll) {
                    if (currentSubString.length() < currentSmallCount) {
                        currentSmallCount = currentSubString.length();
                        smallestSubstring = currentSubString;
                    }
                }
            }
        }

        return smallestSubstring;
     }

    private static boolean isCurrentStringHasAllChars(String str, Map<Character, Integer> sizeMap) {
        for (char c: sizeMap.keySet()) {
            if (str.contains(String.valueOf(c))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

}
