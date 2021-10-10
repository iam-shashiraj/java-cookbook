package com.iamshashiraj.learn.solution;

import java.util.Stack;

public class RemoveKDigitsToFormLowestNumber {
    public static void main(String[] args) {
        String number = "163829";
        int k= 3; // num of digits to be removed
        int[] numArray = new int[number.length()];

        int i = 0;
        for(char c : number.toCharArray()) {
            numArray[i++] = Integer.parseInt(String.valueOf(c));
        }


        Stack<Character> stack = new Stack<>();

        for(char c: number.toCharArray()) {
            while(!stack.isEmpty() && k >0 &&stack.peek() > c) { // pop if there's a dip in a loop
                stack.pop();
                k--;
            }
            if(!stack.isEmpty() || c != '0') { // push the values otherwise and the first nonzero value for the first time
                stack.push(c);
            }
        }

        while(!stack.isEmpty() && k >0) {
            stack.pop();
            k--;
        }

        StringBuilder output = new StringBuilder();
        while(stack.size() > 0) {
            output.append(stack.pop());

        }
        System.out.println(output.reverse());
    }
}
