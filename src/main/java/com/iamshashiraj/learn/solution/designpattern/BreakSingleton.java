package com.iamshashiraj.learn.solution.designpattern;

import java.io.*;

/*
    The singleton pattern is a software design pattern that restricts the instantiation of a class to one "single" instance.
    This is useful when exactly one object is needed to coordinate actions across the system.
    It is used where only a single instance of a class is required to control the action throughout the execution.
    A singleton class shouldn't have multiple instances in any case and at any cost.
    Singleton classes are used for logging, driver objects, caching and thread pool, database connections.
 */

public class BreakSingleton {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        Singleton originalInstance = Singleton.getInstance();

        System.out.println("Breaking singleton by serialization");
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("singleton_object.txt"));
        outputStream.writeObject(originalInstance);
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("singleton_object.txt"));
        Singleton deserializedObject =  (Singleton) inputStream.readObject();
        System.out.print("original instance and deserializedObject are not same ");
        System.out.println(originalInstance.hashCode() == deserializedObject.hashCode());

        System.out.println("Breaking singleton by cloning");
        Singleton clonedInstance = (Singleton) originalInstance.clone();
        System.out.print("original instance and clonedInstance are not same ");
        System.out.println(originalInstance.hashCode() == clonedInstance.hashCode());
    }
}
