package Assignments;

import java.util.Arrays;

public class MaximumProductOfThree {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(maximumProduct(nums));
    }

    private static int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int a = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int b = nums[0] * nums[1] * nums[nums.length - 1];

        return a > b ? a : b;
    }
}
