package com.iamshashiraj.learn.solution;

public class LoopsLearning {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // print all pairs where i, j and j, i are different
        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length; j++) {
                // System.out.println(  i + "  " + j );
            }
        }

        // print all pairs where i, j and j, i are same
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                System.out.println(  i + "  " + j );
            }
        }
    }
}
