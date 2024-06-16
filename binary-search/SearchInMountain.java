package com.maddy.binarysearch.Questions;
//https://leetcode.com/problems/find-in-mountain-array/

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != 0){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end){
         start = 0;
         end = arr.length -1;

        if(arr[start] < arr[end]){
            while(start <= end){
                int mid = start + (end - start) / 2;

                if(target < arr[mid]){
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
                else {
                    return mid; //answer found
                }
            }
        }else {
            while(start <= end){
                int mid = start + (end - start) / 2;

                if(target < arr[mid]){
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    return mid; //answer found
                }
            }
        }
        return -1;
    }
}
