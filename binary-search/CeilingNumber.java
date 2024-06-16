package com.maddy.binarysearch.Questions;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {-67, -27, -12, -5, 1, 2, 3, 15, 27, 37, 56, 95, 164};
        int target = 31;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return arr[start]; //found the ceiling of the number
    }
    static int binarySearch2(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        if(target > end){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return arr[end]; //found the floor of the number
    }
}
