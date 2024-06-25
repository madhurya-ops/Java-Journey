package Assignment;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/submissions/1299997407/

public class MinInRotatedII {
    public static void main(String[] args) {
        int[] nums = {2,2,2,0,1};
        System.out.println(findNum(nums));
    }
    static int findNum(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[end] > nums[mid]){
                end = mid;
            }
            else if(nums[mid] == nums[end]){
                end--;
            }
            else
                start = mid + 1;
        }
        return nums[start];
    }
}
