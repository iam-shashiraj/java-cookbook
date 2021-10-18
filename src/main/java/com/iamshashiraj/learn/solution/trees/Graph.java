package com.iamshashiraj.learn.solution.trees;

import java.util.LinkedList;

public class Graph {
    int numOfNodes;
    LinkedList<Integer>[] adjacentNodes;

    public Graph(int num)
    {
        this.numOfNodes = num;
        this.adjacentNodes = new LinkedList[num];

        for (int i = 0; i < adjacentNodes.length; i++) {
            this.adjacentNodes[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int from, int to)
    {
        this.adjacentNodes[from].add(to);
    }
}
