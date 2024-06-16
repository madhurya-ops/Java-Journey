package Assignment;
//https://leetcode.com/problems/single-element-in-a-sorted-array/submissions/1287039743/

public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {0,0,1};
        System.out.println(singleSearch(nums));
    }
    static int singleSearch(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        if(end == 0){
            return nums[0];
        } else if (nums[0] != nums[1]) {
            return nums[0];
        } else if (nums[end] != nums[end -1]) {
            return nums[end];
        }


        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid + 1 == nums.length || (nums[mid] != nums[mid + 1])
                    && (mid - 1 < 0 || nums[mid] != nums[mid - 1])){
                ans = nums[mid];
            }
            if(((mid % 2) == 0 && nums[mid] == nums [mid + 1])
                || (mid % 2) == 1 && nums[mid] == nums[mid - 1]){
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return ans;
    }
}
