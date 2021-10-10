package com.iamshashiraj.learn.solution.interview;

public class NumOfSubsequenceInOtherRecursive {
    public static void main(String[] args) {
        String s1 = "GeeksforGeeksks";
        String s2 = "Gkss";
        System.out.println(count(s1, s2, s1.length(), s2.length()));
    }

    static int count(String a, String b, int m, int n) {
        if(n == 0) {
            return 1;
        }
        if (m == 0) {
            return 0;
        }
        if (a.charAt(m-1) == b.charAt(n-1)) {
            return count(a,b,m-1, n-1) + count(a, b, m-1, n);
        } else {
            return count(a, b, m-1, n);
        }
    }
}
