/*
 * Problem: Valid Anagram
 * Platform: LeetCode
 * Difficulty: Easy
 * 
 * Description:
 *   Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *   An anagram is a word or phrase formed by rearranging the letters of another, 
 *   using all original letters exactly once.
 * 
 * Example:
 *   Input:  s = "anagram", t = "nagaram"
 *   Output: true
 * 
 * Approach:
 *   1. Count the frequency of each character in both strings.
 *   2. Compare frequency counts to check if they match.
 *   (Using a fixed-size array for lowercase letters 'a' to 'z'.)
 * 
 * Time Complexity: O(n) — where n is the length of the strings.
 * Space Complexity: O(1) — fixed-size array of 26 integers.
 * 
 */
//SOLUTION
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> charCount=new HashMap<>();
        for(char c:s.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!charCount.containsKey(c)){
                return false;
            }
            charCount.put(c,charCount.get(c)-1);
            if(charCount.get(c)<0){
                return false;
            }
        }
        return true;
    }
}