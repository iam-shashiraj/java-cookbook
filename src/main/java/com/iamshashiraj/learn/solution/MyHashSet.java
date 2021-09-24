package com.iamshashiraj.learn.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyHashSet {
    private static final long MAX_NUMBER = 100000;
    private static final int BUCKET_SIZE = 100;
    private List<List<Integer>> parentList;

    public MyHashSet() {
        Object
        parentList = new ArrayList<>(BUCKET_SIZE);
        for (int i = 0; i < BUCKET_SIZE; i++) {
            //parentList.add(null);
        }
    }
    public void add(Integer value) {
        int hash = value % BUCKET_SIZE;
        List<Integer> childList = parentList.get(hash);
        if ( childList == null) {
            List<Integer> list = new LinkedList<>();
            list.add(value);
            parentList.set(hash, list);
        } else {
            if (!childList.contains(value)) {
                childList.add(value);
            }
        }
    }

    public void remove(Integer item) {
        int hash = item % BUCKET_SIZE;
        if (parentList.get(hash) != null) {
            List<Integer> list = parentList.get(hash);
            list.remove(item);
        }
    }

    public boolean contains(Integer item) {
        int hash = item % BUCKET_SIZE;
        if (parentList.get(hash) != null) {
            List<Integer> list = parentList.get(hash);
            return list.contains(item);
        } else {
            return false;
        }
    }
}
