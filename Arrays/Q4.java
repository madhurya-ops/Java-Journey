package com.maddy.patterns.lab1;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("Before rotate: " + Arrays.toString(arr));
        rotateRight(arr, 5);
        System.out.println("After rotate" + Arrays.toString(arr));
    }

    static void rotateRight(int[] arr, int position) {
        if (position <= 0 || position > arr.length) {
            return;  // Invalid rotation count
        }

        int lastElement = arr[position - 1];

        for (int i = position - 1; i > 0; i--) {
            exchange(arr, i, i - 1);
        }

        arr[0] = lastElement;
    }

    static void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
