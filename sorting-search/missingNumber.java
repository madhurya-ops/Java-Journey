package com.maddy.sorting;
//https://leetcode.com/problems/missing-number/description/
//Amazon Question

public class missingNumber {
   public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(Cyclic(nums));
    }
    static int Cyclic(int[] nums){
        int i = 0;
        while(i < nums.length){
             int correctIndex = nums[i];
            if( nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
