package com.iamshashiraj.learn.leetcode;

public class MergeSortedArray {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next =new ListNode(2);
        node1.next.next =new ListNode(2);
        node1.next.next.next =new ListNode(4);
        node1.next.next.next.next =new ListNode(5);

        ListNode node2 = new ListNode(3);
        node2.next =new ListNode(5);
        node2.next.next =new ListNode(7);
        node2.next.next.next =new ListNode(9);

        System.out.println("List 1");
        printList(node1);

        System.out.println("List 2");
        printList(node2);

        System.out.println("merged list");
        mergeSortedList(node1, node2);

    }

    private static void mergeSortedList(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode temp = result;

        while(true) {
            if (list1 == null) {
                temp.next = list2;
                break;
            }
            if (list2 == null) {
                temp.next = list1;
                break;
            }
            if(list1.val < list2.val) {
                temp.next = new ListNode(list1.val);
                temp = temp.next;
                list1 = list1.next;
            } else {
                temp.next = new ListNode(list2.val);
                temp = temp.next;
                list2 = list2.next;
            }
        }
        printList(result.next);
    }

    static void printList(ListNode node) {
        while(node != null) {
            System.out.print(node.val);
            node = node.next;
            System.out.println();
        }
    }
}
