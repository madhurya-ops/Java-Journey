package com.maddy.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-67, -27, -12, -5, 1, 2, 3, 15, 27, 37, 56, 95, 164};
        int target = 123;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


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
        return -1;
    }
}
