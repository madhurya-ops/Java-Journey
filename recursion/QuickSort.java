package com.maddy.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        //to put the pivot in the correct position
        while(start <= end){

            //also a reason if the element is already sortred it will not swap
            while(nums[start] < pivot){
                start++;
            }

            while(nums[end] > pivot){
                end--;
            }

            if(start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        //now, pivot is sorted
        //make the recursion calls to sort the other two halves
        sort(nums, low, end);
        sort(nums, start, high);

    }
}
