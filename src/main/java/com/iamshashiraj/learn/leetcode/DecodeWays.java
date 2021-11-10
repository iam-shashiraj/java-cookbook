package com.iamshashiraj.learn.leetcode;

public class DecodeWays {
    public static void main(String[] args) {
        String num = "10";
        String input = new String(num);
        String x = "10";

        int[] dp = new int[num.length()+1];
        dp[0] = 1;
        dp[1] = num.charAt(0) == '0' ? 0 : 1;

        for (int i=2; i<=num.length(); i++) {
            int current = Integer.parseInt(num.substring(i-1, i));
            int lastTwo = Integer.parseInt(num.substring(i-2, i));
            System.out.println(current + " " + lastTwo);
            if (current > 0) {
                dp[i] += dp[i-1];
            }
            if (lastTwo >= 10 && lastTwo < 27) {
                dp[i] += dp[i-2];
            }

        }
        System.out.println("Total num of ways to decode :" + dp[num.length()]);
    }
}
