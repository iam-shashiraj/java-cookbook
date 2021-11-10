package com.iamshashiraj.learn.leetcode;

import com.iamshashiraj.learn.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    public static void main(String[] args) {
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
        List<String> paths = new ArrayList<>();

        if (node == null) {
            // return paths;
        }
        dfs(node, "", paths);
        System.out.println(paths);
        leastCommonAncestor(node, node, node);
    }

    private static TreeNode leastCommonAncestor(TreeNode root, TreeNode node1, TreeNode node2) {

        if(root == null) {
            return null;
        }
        if (node1 != null || node2 != null) {
            return root;
        }
        TreeNode left = leastCommonAncestor(root.getLeft(), node1, node2);
        TreeNode right = leastCommonAncestor(root.getRight(), node1, node2);
        if(left != null && right != null) {
            return root;
        }
        if(left == null || right == null) {
            return null;
        }
        return left != null ? left : right;
    }

    private static void dfs(TreeNode node, String path, List<String> paths) {
        path += node.getVal();
        if (node.getLeft() == null && node.getRight() == null) {
            paths.add(path);
        }
        if(node.getLeft() != null) {
            dfs(node.getLeft(), path + "->", paths);
        }
        if(node.getRight() != null) {
            dfs(node.getRight(), path + "->", paths);
        }
    }
}
