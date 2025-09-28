// Three Sum Closest
// Leetcode problem number 16

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;
        int ans = 0;
        int prefixSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                sum = nums[i] + nums[start] + nums[end];

                if (Math.abs(target - sum) <= prefixSum) {
                    prefixSum = Math.abs(target - sum);
                    ans = sum;
                }

                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;

        int[] nums2 = {0, 0, 0};
        int target2 = 1;

        int[] nums3 = {1, 1, 1, 1};
        int target3 = 3;

        System.out.println("Result 1: " + sol.threeSumClosest(nums1, target1)); // 2
        System.out.println("Result 2: " + sol.threeSumClosest(nums2, target2)); // 0
        System.out.println("Result 3: " + sol.threeSumClosest(nums3, target3)); // 3
    }
}
