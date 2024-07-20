package com.maddy.patterns.lab1;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {10, 40, 35, 47, 68, 22, 40, 10, 98, 10, 50, 35, 68, 40, 10};
        int ans = checkDuplicates(arr);
        System.out.println("Total duplicate elements: " + ans);
        System.out.println("Most repeating element: " + mostRepeating(arr));
    }

    static int checkDuplicates(int[] arr){
        int maxCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }

    static int mostRepeating(int[] arr){
        Arrays.sort(arr);
        int repeatedNum = arr[0];
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]){
                currentCount++;
            } else {
                if(currentCount > maxCount){
                    maxCount = currentCount;
                    repeatedNum = arr[i - 1];
                }
                currentCount = 1;
            }
        }

        if(currentCount > maxCount){
            repeatedNum = arr[arr.length - 1];
        }

        return repeatedNum;
    }

}


