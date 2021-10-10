package com.iamshashiraj.learn.solution.interview;

/*
    Num of times first one appears as subsequence in second
    S1=ABC, S2 = ABCBABC ANS = 5
 */
public class NumOfSubsequenceInOther {
    public static void main(String[] args) {
        String s1 = "GeeksforGeeksks";
        String s2 = "Gks";
        int m = s1.length();
        int n = s2.length();

        int[][] lookup = new int[m+1][n+1];

        for (int i = 0; i <= n; i++) {
            lookup[0][i] = 0;
        }

        for (int i = 0; i <= m; i++) {
            lookup[i][0] = 1;
        }

        for (int i=1; i<= m; i++) {
            for (int j=1; j<= n; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    lookup[i][j] = lookup[i-1][j-1] + lookup[i-1][j];
                } else {
                    lookup[i][j] = lookup[i-1][j];
                }
            }
        }
        System.out.println(lookup[m][n]);
    }
}
