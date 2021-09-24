package com.iamshashiraj.learn.solution;

import com.iamshashiraj.learn.model.TreeNode;

public class BinarySearchTreeTraversal {
    public static void main(String[] args) {
        TreeNode node2 = new TreeNode(2);
        TreeNode node8 = new TreeNode(8);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node3 = new TreeNode(3);
        TreeNode node10 = new TreeNode(10);
        TreeNode node15 = new TreeNode(15);
        TreeNode node11 = new TreeNode(11);

        node8.setRight(node11);
        node8.setLeft(node5);
        node11.setLeft(node10);
        node11.setRight(node15);
        node5.setRight(node6);
        node5.setLeft(node2);
        node2.setRight(node3);

        // bstInOrderTraverse(node8);

        int[] numbers = {8, 5, 11, 10, 15, 6, 2, 4};
        TreeNode root = constructBinarySearchTree(numbers);
        bstInOrderTraverse(root);
    }

    private static TreeNode constructBinarySearchTree(int[] numbers) {
        if (numbers.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(numbers[0]);
        for (int i =1; i < numbers.length; i++) {
            TreeNode node = new TreeNode(numbers[i]);
            TreeNode tempNode = root;
            TreeNode prevNode = null;
            while(tempNode != null) {
                prevNode =  tempNode;
                if (node.getVal() <= tempNode.getVal()) {
                    tempNode = tempNode.getLeft();
                } else {
                    tempNode = tempNode.getRight();
                }
            }
            if (node.getVal() <= prevNode.getVal()) {
                prevNode.setLeft(node);
            } else {
                prevNode.setRight(node);
            }
        }
        return root;
    }

    private static void bstInOrderTraverse(TreeNode node) {
        if(node == null) {
            return;
        }
        bstInOrderTraverse(node.getLeft());
        System.out.print(node.getVal() + ",");
        bstInOrderTraverse(node.getRight());
    }
}
