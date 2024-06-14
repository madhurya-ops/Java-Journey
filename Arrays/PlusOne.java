package com.maddy.arrays.Assignment;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] ans = plusOne(nums);
        System.out.println(Arrays.toString(nums));
    }

    static int[] plusOne(int[] digits){
        int n = digits.length;
        for (int i = n - 1; i >= 0 ; i--) {
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
