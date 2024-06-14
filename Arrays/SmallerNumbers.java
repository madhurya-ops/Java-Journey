package com.maddy.arrays.Assignment;

public class SmallerNumbers {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int count = 0;
        int[] ans = null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] <= nums[j]){
                    continue;
                }
                if(nums[i] > nums[j]){
                    count++;
                }
            }
             ans = new int[]{count};
        }

        System.out.println(count);
    }
//    public int[] smallerNumbersThanCurrent(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if(nums[i] == nums[j]){
//                    continue;
//                }
//                if(nums[i] < nums[j]){
//                    count++;
//                }
//            }
//        }
//        return new int[]{count};
//    }
}
