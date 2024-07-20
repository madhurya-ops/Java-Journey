package com.maddy.patterns.lab1;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {6, 8, 5, 3, 1, 9, 12};
         Arrays.sort(arr);
         int secondLargest = arr[arr.length - 2];
         int secondSmallest = arr[1];
        System.out.println("Second largest: " + secondLargest);
        System.out.println("Second smallest: " + secondSmallest);
    }

}
