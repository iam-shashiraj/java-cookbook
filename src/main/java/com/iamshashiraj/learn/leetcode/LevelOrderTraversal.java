package com.iamshashiraj.learn.leetcode;

import com.iamshashiraj.learn.model.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/*
    watch https://www.youtube.com/watch?v=TO5zsKtc1Ic&t=507s&ab_channel=TECHDOSE
 */
public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-3);
        root.setLeft(new TreeNode(-2));
        root.setRight(new TreeNode(-5));
        root.getLeft().setRight(new TreeNode(4));
        root.getRight().setLeft(new TreeNode(7));
        root.getRight().setRight(new TreeNode(9));

        List<List<Integer>> list = levelOrderTraversal(root);
        //list.stream().
        //System.out.println(list);

        int result = Integer.MIN_VALUE;


        getMaxSum(root, result);
        System.out.println();


    }

    private static int getMaxSum(TreeNode root, int result) {
        if (root == null) {
            return 0;
        }
        int left = getMaxSum(root.getLeft(), result);
        int right = getMaxSum(root.getRight(), result);

        int partOfMaxPath = Math.max(Math.max(left+ root.getVal(), right+ root.getVal()), root.getVal());
        int rootOfMaxPath = Math.max(partOfMaxPath, left+right+root.getVal());
        result = Math.max(rootOfMaxPath, result);
        //System.out.println(result);
        return partOfMaxPath;
    }

    private static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> levelNodes = new ArrayList<>();
            int size = queue.size();

            for (int i=0; i<size; i++) {
                TreeNode node = queue.remove();
                levelNodes.add(node.getVal());
                if (node.getLeft() != null) queue.add(node.getLeft());
                if (node.getRight() != null) queue.add(node.getRight());
            }
            result.add(levelNodes);
        }
        return  result;
    }
}
