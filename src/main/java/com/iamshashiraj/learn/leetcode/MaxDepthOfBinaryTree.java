package com.iamshashiraj.learn.leetcode;

import com.iamshashiraj.learn.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MaxDepthOfBinaryTree {
    static int max = 0;
    static List<List<Integer>> paths = new ArrayList<>();
    public static void main(String[] args) {
        int maxDepth = 0;

        TreeNode node = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        node2.setLeft(node1);
        node3.setLeft(node2);
        node3.setRight(node4);
        node7.setLeft(node6);
        node8.setRight(node9);

        node7.setRight(node8);
        node.setLeft(node3);
        node.setRight(node7);
        List<Integer> path = new ArrayList<>();


        List<String> stringPaths = new ArrayList<>();

        if (node != null) {
            dfs(node, path);
            dfs2(node, "", stringPaths);
            //System.out.println();
        }
        //paths.forEach(System.out::println);
        stringPaths.forEach(System.out::println);
        System.out.println("Max depth is: " + max);
    }

    private static void dfs(TreeNode node, List<Integer> path) {
        path.add(node.getVal());
        if (node.getLeft() == null && node.getRight() == null) {
            System.out.println(path);
            paths.add(path);
            path.clear();
            //path.add(node.getVal());
        }
        if(node.getLeft() != null) {
            dfs(node.getLeft(), path);
        }
        if(node.getRight() != null) {
            dfs(node.getRight(), path);
        }
    }

    private static void dfs2(TreeNode node, String path, List<String> paths) {
        path += node.getVal();
        if (node.getLeft() == null && node.getRight() == null) {
            paths.add(path);
        }
        if(node.getLeft() != null) {
            dfs2(node.getLeft(), path, paths);
        }
        if(node.getRight() != null) {
            dfs2(node.getRight(), path, paths);
        }
    }
}
