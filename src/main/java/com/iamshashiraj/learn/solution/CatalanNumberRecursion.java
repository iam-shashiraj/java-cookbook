package com.iamshashiraj.learn.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//import java.util.Collection

// 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862,

public class CatalanNumberRecursion {
    public static void main(String[] args) {
        int input = 4;
        System.out.println(input + " catalan number is " + catalan(input));
    }



    static int catalan(int n) {
        int res = 0;
        if (n <= 1) {
            return 1;
        }
        for (int i= 0; i< n; i++) {
            res += catalan(i)*catalan(n-i-1);
        }
        return  res;
    }
}
