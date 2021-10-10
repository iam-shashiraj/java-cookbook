package com.iamshashiraj.learn.solution;

public class SubArraySumDivisiblebyK {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int k = 1;

        int count = 0;
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                int diff = j-i;
                int sum = 0;
                while(diff > 0) {
                    sum = sum + numbers[j];
                    diff--;
                }
                if (sum % k == 0) count++;
            }
        }
        System.out.println(count);
    }
}
