//https://leetcode.com/problems/4sum/submissions/1328722689/
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                if (j > (i + 1) && nums[j] == nums[j - 1]) continue;

                int start = j + 1;
                int end = n - 1;

                while (start < end) {
                    long sum = (long)nums[i] + nums[j] + nums[start] + nums[end];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        int low = nums[start];
                        int high = nums[end];
                        start++;
                        end--;
                        while (start < end && nums[start] == low) start++;
                        while (start < end && nums[end] == high) end--;
                    } else if (sum > target) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
        return ans;
    }
}
