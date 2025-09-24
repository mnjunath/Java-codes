// longest SubString with no repeating characters

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Input: " + s1 + " -> Output: " + sol.lengthOfLongestSubstring(s1));
        System.out.println("Input: " + s2 + " -> Output: " + sol.lengthOfLongestSubstring(s2));
        System.out.println("Input: " + s3 + " -> Output: " + sol.lengthOfLongestSubstring(s3));
    }

    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean[] seen = new boolean[256]; 
            int currLen = 0;

            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                if (seen[c]) { 
                    break;
                }

                seen[c] = true;
                currLen++;
                if (currLen > maxLen) {
                    maxLen = currLen;
                }
            }
        }

        return maxLen;
    }
}
