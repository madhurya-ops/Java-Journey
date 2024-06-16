package com.maddy.binarysearch.Questions;
//https://leetcode.com/problems/split-array-largest-sum/description/

public class SplitArray {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        //this loop is to define the search range
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while(start < end){
            int mid = start + (end -start) / 2;

            int sum = 0;
            int pieces = 1;

            for(int num : nums){
                if(sum + num > mid){
                    //you cannot add in the same sub-array
                    //create a new sub-array
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            if(pieces > k){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
