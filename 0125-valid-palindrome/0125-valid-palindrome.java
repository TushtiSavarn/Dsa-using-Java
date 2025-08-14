class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Normalize the string (lowercase and remove non-alphanumeric)
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Step 2: Use two-pointer approach to check palindrome
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // not a palindrome
            }
            left++;
            right--;
        }
        return true; // if loop ends, it is a palindrome
    }
}
