package com.iamshashiraj.learn.solution.arrays;

public class HouseRobber {
    public  static void main(String[] args) {
        int a =10;
        int[] housesWithValue = {1, 5, 3, 1};
        
        int rob1 = 0; int rob2 = 0;

        // rob1, rob2, n, n+1 ....
        for(int num: housesWithValue) {
            int temp = Math.max(rob1+ num, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        System.out.println(rob2);
    }
}
