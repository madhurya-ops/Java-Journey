package com.maddy.linearsearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        //int target = 64;
        //int[] ans = search(arr, target);
        int ans = max(arr);
        System.out.println(ans);
    }
    static int max(int[][] arr){
        //assuming the array is not null
        //assuming the first element of the array to be maximum
        int ans = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(ans < arr[row][col]){
                    ans = arr[row][col];
                }
            }
        }
        return ans;
    }
    static int[] search(int[][] arr, int target){
        //assuming the array is not null
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
