package com.iamshashiraj.learn.solution;

import com.iamshashiraj.learn.model.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Dell {
    public static void main(String[] args) {
       Integer [] nums = {1, 2, 3, 4};

       List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
        TestInterface testInterface = n -> n %2 == 0;
       for (Integer num: list) {
           list.add(4);
           // list.removeIf(testInterface::test);
       }

      // list.removeIf(testInterface::test);
       list.forEach(System.out::println);
    }
}

interface TestInterface {
    boolean test(Integer n);
}
