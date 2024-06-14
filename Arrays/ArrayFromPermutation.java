package com.maddy.arrays.Assignment;
//https://leetcode.com/problems/build-array-from-permutation/description/
public class ArrayFromPermutation {
    public static int[] main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int length = nums.length;
        int[] ans = new int[length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
//    static int[] buildArray(int[] nums) {
//
//
//    }


}
