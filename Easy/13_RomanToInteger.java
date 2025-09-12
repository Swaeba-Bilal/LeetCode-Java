/**
 * LeetCode Problem: 13. Roman to Integer
 * Difficulty: Easy
 * 
 * Problem Link: https://leetcode.com/problems/roman-to-integer/
 * 
 * Date Solved: August 22, 2025
 * 
 * Description:
 * Given a roman numeral, convert it to an integer.
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D, and M.
 * 
 * Approach:
 * - Store the values of each Roman numeral in a HashMap.
 * - Traverse the string from left to right.
 * - If the current numeral is smaller than the next one, subtract it.
 * - Otherwise, add it to the result.
 * 
 * Time Complexity: O(n), where n = length of the string
 * Space Complexity: O(1), since the HashMap size is constant
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            
            // If the next value is greater, subtract current value
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }
        
        return result; 
    }
}
