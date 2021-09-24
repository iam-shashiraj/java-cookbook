package com.iamshashiraj.learn.solution;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TwoDSortedArraySearchKey {
    public static void main(String[] args) {
        int key = 5;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the num of rows");
        int row = 3;//scanner.nextInt();

        System.out.println("Enter the num of rows");
        int column = 3; //scanner.nextInt();


        int[][] input = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Enter the nums");
        for (int i=0; i< row; i++) {
            for (int j=0; j< column; j++) {
                //input[i][j] = scanner.nextInt();
            }
        }

        int rowToScan = -1;

        for (int i=0; i < row; i++) {
            System.out.println(input[i][column-1]);
            if (input[i][column-1] >= key) {
                rowToScan = i;
                break;
            }
        }
        System.out.println("row to scan "+ rowToScan);

        if (rowToScan != -1) {
            int[] elements = new int[column];
            for (int i=0; i < column; i++) {
                elements[i] =  input[rowToScan][i];
            }
            if(binarySearch(elements, key)) {
                System.out.println("key found in " + rowToScan + "'s row");
            }
        } else {
            System.out.println("not found");
        }

    }

    private static boolean binarySearch(int[] numbers, int key){
        IntStream.of(numbers).forEach(System.out::println);
        boolean res = false;
        int low =0;
        int high = numbers.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (key == numbers[mid]) {
                res = true;

                return true;
            } else if (key > numbers[mid]) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return res;
    }

}
