/**
 * LeetCode Problem: 27. Remove Element
 * Difficulty: Easy
 * 
 * Problem Link: https://leetcode.com/problems/remove-element/
 * 
 * Date Solved: August 16, 2025
 * 
 * Description:
 * Given an integer array nums and an integer val, remove all occurrences of val 
 * in-place. The relative order of the elements may be changed. 
 * Return the number of elements after removal.
 * 
 * Approach:
 * - Use a pointer `k` to track the position of the next valid element.
 * - Iterate over the array, and whenever nums[i] is not equal to val, 
 *   place it at nums[k] and increment k.
 * - Return k as the length of the array without the removed element.
 * 
 * Time Complexity: O(n), where n = length of nums
 * Space Complexity: O(1), in-place modification
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
