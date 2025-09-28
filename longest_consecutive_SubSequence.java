// Longest Consecutive SubSequence
// LeetCode problem 128

import java.util.Arrays;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1; 
            }
        }

        return Math.max(maxCount, count);
    }

    
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int[] nums3 = {};

        System.out.println("Longest consecutive sequence length (nums1): " + sol.longestConsecutive(nums1));
        System.out.println("Longest consecutive sequence length (nums2): " + sol.longestConsecutive(nums2));
        System.out.println("Longest consecutive sequence length (nums3): " + sol.longestConsecutive(nums3));
    }
}
