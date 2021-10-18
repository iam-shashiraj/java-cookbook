package com.iamshashiraj.learn.solution.strings;

public class StringTrial {
    public static void main(String[] args) {
        String input = "good";

        for(int i=0; i<input.length(); i++) {
            for(int j=i+1; j<=input.length(); j++) {
                System.out.println(input.substring(i, j));
            }
        }
    }
}
