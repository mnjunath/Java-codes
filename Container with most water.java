// Container with most water
// Leetcode problem number 11

import java.util.Arrays;

public class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int length = Math.min(height[left], height[right]);
            int area = width * length;
            maxWater = Math.max(maxWater, area);

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1, 1};
        int[] height3 = {4, 3, 2, 1, 4};

        System.out.println("Max area 1: " + sol.maxArea(height1)); // 49
        System.out.println("Max area 2: " + sol.maxArea(height2)); // 1
        System.out.println("Max area 3: " + sol.maxArea(height3)); // 16
    }
}
