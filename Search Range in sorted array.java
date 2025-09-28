// Search Range in sorted array
// Leetcode problem number 34

import java.util.Arrays;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                range[0] = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                range[1] = i;
                break;
            }
        }

        return range;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int[] nums3 = {};
        int[] nums4 = {1};

        System.out.println("Result 1: " + Arrays.toString(sol.searchRange(nums1, 8)));
        System.out.println("Result 2: " + Arrays.toString(sol.searchRange(nums2, 6)));
        System.out.println("Result 3: " + Arrays.toString(sol.searchRange(nums3, 0)));
        System.out.println("Result 4: " + Arrays.toString(sol.searchRange(nums4, 1)));
    }
}
