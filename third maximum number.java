// third maximum number
// Leetcode problem number 414

import java.util.Arrays;

public class Solution {
    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;

        for (int n : nums) {
            if ((max1 != null && n == max1) || (max2 != null && n == max2) || (max3 != null && n == max3)) {
                continue;
            }

            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }

        return (max3 == null) ? max1 : max3;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {3, 2, 1};
        int[] nums2 = {1, 2};
        int[] nums3 = {2, 2, 3, 1};
        int[] nums4 = {1, 2, 2, 5, 3, 5};

        System.out.println("Third max 1: " + sol.thirdMax(nums1)); // 1
        System.out.println("Third max 2: " + sol.thirdMax(nums2)); // 2
        System.out.println("Third max 3: " + sol.thirdMax(nums3)); // 1
        System.out.println("Third max 4: " + sol.thirdMax(nums4)); // 2
    }
}
