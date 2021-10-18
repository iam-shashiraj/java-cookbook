package com.iamshashiraj.learn.solution;

public class KidsToysIndex {
    public static void main(String[] args) {
        int numOfKids = 3;
        int numOfToys = 2;
        int startingIndex = 3;

        int result = 0;

        int rem = numOfToys % numOfKids;
        rem = (rem + (startingIndex -1))%numOfKids;

        if (rem == 0) {
            result = numOfKids;
        } else {
            result = rem;
        }

        System.out.println("last kid to get toy is: " +  result );
    }
}
