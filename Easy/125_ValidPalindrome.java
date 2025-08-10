/*
 * Problem: Valid Palindrome
 * Platform: LeetCode
 * Difficulty: Easy
 * 
 * Description:
 *   Given a string, determine if it is a palindrome, considering only 
 *   alphanumeric characters and ignoring cases.
 * 
 * Example:
 *   Input: "A man, a plan, a canal: Panama"
 *   Output: true
 * 
 * Approach:
 *   1. Use two pointers from start and end of the string.
 *   2. Skip non-alphanumeric characters.
 *   3. Compare characters in a case-insensitive manner.
 *   4. Return false if mismatch is found; otherwise true.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 
 */
//SOLUTION
class Solution {
    public boolean isPalindrome(String s) {
        String cleaned=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left=0;
        int right= cleaned.length()-1;

    while(left<right){
        if(cleaned.charAt(left)!=cleaned.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
    }
}