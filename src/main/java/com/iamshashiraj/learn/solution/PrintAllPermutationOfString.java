package com.iamshashiraj.learn.solution;

public class PrintAllPermutationOfString {
    public static void main(String[] args) {
        String input = "abcde";

        printPermutation(input, "");
    }

    public static void printPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans + "");
            return;
        }

        for (int i=0; i< str.length(); i++) {
            char ch = str.charAt(i);

            String restOfString = str.substring(0, i) + str.substring(i+1);
            printPermutation(restOfString, ans+ch);
        }
    }
}
