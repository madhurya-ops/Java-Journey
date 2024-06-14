package com.maddy.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

//        int[][] arr = {
//                {1, 2, 3},
//                {3, 4, 5},
//                {6, 7, 8}
//        };
       // System.out.println(Arrays.toString(arr));

        //input
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        //output
        for(int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
//            for(int col = 0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
        }
    }
}