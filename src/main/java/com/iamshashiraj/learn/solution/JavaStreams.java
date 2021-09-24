package com.iamshashiraj.learn.solution;

import com.iamshashiraj.learn.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
    Print the employee details of employees having top 3 salaries
    catch: multiple employees can have same salary
 */
public class JavaStreams {
    public static void main(String[] args) {

        List<Person> ppl = Arrays.asList(
                new Person("Shashi", "", 25, 10000, true),
                new Person("Sandesh", "", 25, 8000, true),
                new Person("Sham", "", 25, 8000, true),
                new Person("Amogh", "", 25, 9000, true),
                new Person("xyz", "", 25, 25000, false)
        );

        ppl.stream().filter(p -> p.isAlive()).sorted((p1, p2) -> p2.getSalary() - p1.getSalary()).limit(4).forEach(System.out::println);

        /*
            int[] numbers = {10, 20, 30, 40, 0, 5};
            IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::println);
         */

    }
}
