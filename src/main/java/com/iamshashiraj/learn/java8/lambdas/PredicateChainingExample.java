package com.iamshashiraj.learn.java8.lambdas;
import java.util.function.Predicate;
/*
    - Lambdas can be chained using and or and negate chains/joins
    - negate takes only single lambda
 */
class PredicateChainingExample {
    public static void main(String[] args) {
        String input = "some text input";
        Predicate<String> isStringLengthMoreThanFive = p -> p.length() > 5;
        Predicate<String> isStringLengthEven = p -> p.length() % 2 == 0;

        System.out.print("Is string length more than five and string length even: ");
        System.out.println(isStringLengthMoreThanFive.and(isStringLengthEven).test(input));

        System.out.print("Is string length more than five or string length even: ");
        System.out.println(isStringLengthMoreThanFive.or(isStringLengthEven).test(input));

        System.out.print("Is string length less than five: ");
        System.out.println(isStringLengthMoreThanFive.negate().test(input));

        System.out.print("Is string length odd: ");
        System.out.println(isStringLengthEven.negate().test(input));


    }
}
