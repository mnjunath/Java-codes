

class Main {
    public static String longestPalindrome(String str) {
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {  // <= to include last char
                String sub = str.substring(i, j);
                if (palindrome(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        return longest;
    }

    public static boolean palindrome(String str) {
        int start = 0;
        int end = str.length() - 1;  
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "annnaee";
        System.out.println(longestPalindrome(str)); // Output: annna
    }
}
