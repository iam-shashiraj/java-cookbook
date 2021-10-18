package com.iamshashiraj.learn.solution.trees;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class DFS {
    public static void main(String[] args) {
        int numOfNodes = 6;
        Graph g = new Graph(numOfNodes);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);

        System.out.println("Following is the Depth First Traversal Iteratively");
        DFS(g, 0, numOfNodes);

        System.out.println("\nFollowing is the Depth First Traversal recursively");
        HashSet<Integer> visited = new HashSet<>();
        printDfsRecursive(g, 0, visited);
    }

    private static void DFS(Graph graph, int root, int numOfNodes) {
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(root);

        while(!stack.empty()) {
            root = stack.pop();
            if(!visited.contains(root)) {
                System.out.print(root + " ");
                visited.add(root);
            }
            for (Integer adjacentNode: graph.adjacentNodes[root]) {
                if (!visited.contains(adjacentNode)) {
                    stack.push(adjacentNode);
                }
            }
        }
    }

    private static void printDfsRecursive(Graph graph, int root, HashSet<Integer> visited) {
        visited.add(root);
        System.out.print(root + " ");
        for(Integer adjacentNode: graph.adjacentNodes[root]) {
            if (!visited.contains(adjacentNode)) {
                printDfsRecursive(graph, adjacentNode, visited);
            }
        }
    }
}
