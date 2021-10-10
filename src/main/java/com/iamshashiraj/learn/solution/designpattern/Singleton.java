package com.iamshashiraj.learn.solution.designpattern;

import java.io.*;

public class Singleton implements Serializable, Cloneable {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
