package com.iamshashiraj.learn.leetcode;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        int num = 4; // second node from last to be removed
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        ListNode result = one;
        ListNode temp = one;
        int size = 0;

        while(temp != null) {
            size++;
            temp = temp.next;
        }

        int nodeTobeDeleted = (size - num);
        int i = 1;
        ListNode first = result;
        ListNode second  = result.next;
        while(i <= nodeTobeDeleted) {
            if (i == nodeTobeDeleted) {
                first.next = second.next;
                break;
            }
            first = second;
            second = second.next;
            i++;
        }

        while(result != null) {
            System.out.println(result.val + " ");
            result = result.next;
        }

    }
}
