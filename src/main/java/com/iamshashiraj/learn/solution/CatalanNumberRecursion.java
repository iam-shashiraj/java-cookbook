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

public class CatalanNumberRecursion {
    public static void main(String[] args) {
        int input = 4;

        //IntStream.of(1,2).boxed().collect(Collectors.to)
        Map<Integer, Integer> m  = new HashMap<>();
        m.put(null, 100);
        m.put(null, 200);
        //System.out.println();
        System.out.println(input + " catalan number is " + catalan(input));
        // 1 1 2 3 5 8
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
