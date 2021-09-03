package com.iamshashiraj.learn.java8.lambdas;

import java.util.function.Function;

public class FunctionChainingExample {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleMe = num -> num*2;
        Function<Integer, Integer> cubeMe = num -> num*num*num;

        System.out.println("double me: 2");
        System.out.println(doubleMe.apply(2));

        System.out.println("Cube me: 3");
        System.out.println(cubeMe.apply(3));

        System.out.println("double 2 andThen cube 3");
        System.out.println(doubleMe.andThen(cubeMe).apply(2));

        System.out.println("double 2 andThen cube 3");
        System.out.println(doubleMe.compose(cubeMe).apply(2));

    }
}
