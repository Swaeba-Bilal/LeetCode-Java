/*
 * Problem: Single Number
 * Platform: LeetCode
 * Difficulty: Easy
 * 
 * Description:
 *   Given a non-empty array of integers nums, every element appears twice except for one.
 *   Find that single one and return it.
 *   You must implement a solution with a linear runtime complexity and use only constant extra space.
 * 
 * Example:
 *   Input:  nums = [4,1,2,1,2]
 *   Output: 4
 * 
 * Approach:
 *   1. Use bitwise XOR operation to cancel out numbers appearing twice.
 *   2. Since a ^ a = 0 and a ^ 0 = a, the duplicate elements will cancel out, leaving the single number.
 * 
 * Time Complexity: O(n) — where n is the number of elements in nums.
 * Space Complexity: O(1) — no extra space used.
 * 
 */
//SOLUTION
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR cancels out duplicates
        }
        return result;
    }
}