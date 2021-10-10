package com.iamshashiraj.learn.solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AddTwoArrays {
    public static void main(String[] args) {
        int [] first = {1,0,5,6};
        int [] second = {8, 9};
        int i=0, j=0;
        Stack<Integer> q1 = new Stack<>();
        Stack<Integer> q2 = new Stack<>();
        for (int num : first) {
            q1.add(num);
        }
        for (int num : second) {
            q2.add(num);
        }
        int carry = 0;
        while(!q1.isEmpty()  || !q2.isEmpty() ) {
            int a = 0; int b = 0; int numToInsert =0; int sum =0;
            if (!q1.isEmpty()) {
                a = q1.pop();
            }
            if (!q2.isEmpty()) {
                b = q2.pop();
            }
            sum = a + b + carry;
            if(sum > 9) {
                carry = 1;
                numToInsert = sum % 10;
            } else {
                numToInsert = sum;
                carry = 0;
            }
            numToInsert = numToInsert;
            System.out.print(numToInsert + " ");
        }
    }
}
