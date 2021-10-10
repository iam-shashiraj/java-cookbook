package com.iamshashiraj.learn.solution;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        System.out.println(LongestUniqueSubstring("abcdad"));
    }

    public static int LongestUniqueSubstring(String str) {
        if (str.length() <= 1) {
            return 0;
        }

        int maxLength = -1;
        String currentSubString = "";

        for (char c: str.toCharArray()) {
            String currentChar = String.valueOf(c);

            if (currentSubString.contains(currentChar)) {
                currentSubString = currentSubString.substring(
                        currentSubString.indexOf(currentChar) + 1
                );
                currentSubString = currentSubString + currentChar;
            } else {
                currentSubString = currentSubString + currentChar;
            }
            maxLength =Math.max(currentSubString.length(), maxLength);
        }
        return maxLength;
    }
}
