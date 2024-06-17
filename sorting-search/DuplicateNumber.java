package com.maddy.sorting;
//https://leetcode.com/problems/find-the-duplicate-number/description/
//Amazon and Microsoft

public class DuplicateNumber {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
        int ans = 0;
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                ans = nums[index];
            }
        }
        return ans;
    }
    void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
