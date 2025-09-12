/**
 * LeetCode Problem: 14. Longest Common Prefix
 * Difficulty: Easy
 * 
 * Problem Link: https://leetcode.com/problems/longest-common-prefix/
 * 
 * Date Solved: August 17, 2025
 * 
 * Description:
 * Write a function to find the longest common prefix string among an array of strings.
 * If there is no common prefix, return an empty string "".
 * 
 * Approach:
 * - Take the first string as the initial prefix.
 * - For each string, reduce the prefix length until it matches the start of the string.
 * - Continue until all strings are checked or prefix becomes empty.
 * 
 * Time Complexity: O(S), where S = sum of all characters in all strings
 * Space Complexity: O(1), since no extra space is used apart from variables
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
