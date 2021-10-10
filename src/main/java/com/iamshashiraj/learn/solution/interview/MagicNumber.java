package com.iamshashiraj.learn.solution.interview;

public class MagicNumber {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;

        for (int i=0; i< Math.pow((double) 10, (double) num); i++) {
            String input = String.valueOf(i);
            if (input.length() % 2 != 0) {
                input = "0" + input;
            }

            if (getCount(input.substring(0, (num/2))) == getCount(input.substring((num/2)))) {
                System.out.println(input);
                count++;
            }
        }
        System.out.println("count " + count);
    }

    static int getCount(String str) {
        int count = 0;
        int digits = str.length();
        for (Character c: str.toCharArray()) {
            count = count+ Integer.parseInt(String.valueOf(c));
        }
        return count;
    }
}
