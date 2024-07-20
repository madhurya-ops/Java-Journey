package com.maddy.patterns.lab1;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println("Input array: " + Arrays.toString(arr));
        int[] ans = prefixSum(arr);
        System.out.println("Output array: " + Arrays.toString(ans));
    }

    static int[] prefixSum(int[] arr){
        int[] ans = new int[arr.length];

        ans[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans[i] = ans[i - 1] + arr[i];
        }
        return ans;
    }


}
