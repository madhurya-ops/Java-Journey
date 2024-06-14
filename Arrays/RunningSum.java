package com.maddy.arrays.Assignment;
//https://leetcode.com/problems/running-sum-of-1d-array/

public class RunningSum {
    public static void main(String[] args) {

    }
    public int[] runningSum(int[] nums) {
//        int[] sum = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j <= i; j++) {
//                 sum[i] += nums[j];
//            }
//        }
//        return sum;
        //Alternative approach (better)
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
