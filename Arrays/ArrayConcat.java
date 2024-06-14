package com.maddy.arrays.Assignment;
//https://leetcode.com/problems/concatenation-of-array/
public class ArrayConcat {
    public static void main(String[] args) {

    }
    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i + n] = nums[i];
          }
        return ans;
    }
}
