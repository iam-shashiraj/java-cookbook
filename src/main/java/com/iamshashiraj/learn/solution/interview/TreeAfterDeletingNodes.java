package com.iamshashiraj.learn.solution.interview;

import java.util.ArrayList;
import java.util.List;

/*
        Given a binary tree with toBeDeleted flag, form a list of all root nodes after deletion of nodes to be deleted
                    10
               8 T            15
           6     7        12 T   18
                        11 T  13

            Answer to above example is 10 6 7 13
         */

public class TreeAfterDeletingNodes {
    private static List<Integer> roots = new ArrayList<>();
    public static void main(String[] args) {
        Node root = new Node(10, false);
        root.right = new Node(15, false);
        root.left = new Node(8, true);

        root.left.left = new Node(6, false);
        root.left.right = new Node(7, false);

        root.right.left = new Node(12, true);
        root.right.right = new Node(18, false);

        root.right.left.left = new Node(11, true);
        root.right.left.right = new Node(13, false);

        if (!root.toBeDeleted) {
            roots.add(root.value);
        } else {
            if (root.left != null && !root.left.toBeDeleted)roots.add(root.left.value);
            if (root.right != null && !root.right.toBeDeleted) roots.add(root.right.value);
        }

        traverseTree(root, null, false);//.stream().forEach(System.out::println);

        roots.stream().forEach(System.out::println);
    }

    static List<Integer> traverseTree(Node node, Node parent, boolean isLeft) {
        if (node == null) {
           return null;
        }

        if (parent != null) {
            if (isLeft) parent.left = null;
            else parent.right = null;

            if(node.toBeDeleted) {
                if (node.left != null && !node.left.toBeDeleted)roots.add(node.left.value);
                if (node.right != null && !node.right.toBeDeleted) roots.add(node.right.value);
            }
        }

        //System.out.println(node.value);
         traverseTree(node.left, node, true);
         traverseTree(node.right, node, false);
        return roots;
    }

    static void printTree(Node node) {
        if (node == null) {
            return;
        }
        printTree(node.left);
        System.out.println(node.value);
        printTree(node.right);
    }
}
