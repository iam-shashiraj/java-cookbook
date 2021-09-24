package com.iamshashiraj.learn.solution;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingString {
    public static void main(String[] args) {
        System.out.println("Please enter input string");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (Character c: input.toCharArray()) {
            if (charCountMap.get(c) != null)
                charCountMap.put(c, charCountMap.get(c) + 1) ;
            else
                charCountMap.put(c, 1);
        }
        Character output = '_';
        for(Character c: charCountMap.keySet()) {
            if (charCountMap.get(c).equals(1)) {
                output = c;
                break;
            }
        }
        System.out.println("First non repeating character is: " + output);
    }
}
