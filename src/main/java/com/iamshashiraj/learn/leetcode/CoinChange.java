package com.iamshashiraj.learn.leetcode;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int [] coins = {1, 10, 100};
        int amount = 10;

        int[] itdp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;

        for (int i = 0; i <= amount; i++) {
            for (int coin: coins) {
                if (i-coin >= 0)
                dp[i] = Math.min(dp[i], 1+dp[i-coin]);
            }
        }
        System.out.println(dp[amount]);
    }
}
