package com.iamshashiraj.learn.feature;

import com.iamshashiraj.learn.model.Person;

import java.util.Map;
import java.util.WeakHashMap;

// create few weak ref and hard/strong ref
// insert them to weakhashmap
// force gc
// check weak ref are gone
public class WeakHashMapExample {
    public static void main(String[] args) {

        Map<Person, Integer> personScoreMap = new WeakHashMap<Person, Integer>();
        personScoreMap.put(new Person("Shash", "Ganiga", 30), 100);
        Person rajnikanth = new Person("Rajni", "Kanth", 30);
        personScoreMap.put(rajnikanth, 100);
        System.out.println(personScoreMap.size());
        System.gc();
        System.out.println(personScoreMap.size());

    }
}
