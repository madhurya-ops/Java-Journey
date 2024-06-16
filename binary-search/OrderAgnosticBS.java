package com.maddy.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {-67, -27, -12, -5, 1, 2, 3, 15, 27, 37, 56, 95, 164};
        int[] arr = {768, 345, 98, 94, 90, 89, 69, 66, 43, 39, 34, 22, 12};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

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
