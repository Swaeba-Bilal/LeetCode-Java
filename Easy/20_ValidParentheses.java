/*
 * Problem: Valid Parentheses
 * Platform: LeetCode
 * Difficulty: Easy
 * 
 * Description:
 *   Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 *   determine if the input string is valid.
 * 
 * Example:
 *   Input: "()[]{}"
 *   Output: true
 * 
 * Approach:
 *   1. Use a stack to track opening brackets.
 *   2. Push opening brackets onto the stack.
 *   3. On encountering a closing bracket, check if it matches the top of the stack.
 *   4. If all match and stack is empty at the end, return true.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 */
//SOLUTION
class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack= new Stack<>();
       for(char c:s.toCharArray()){
         
        if(c=='(' || c=='{' || c=='['){
            stack.push(c);
        }
        else{
            if(stack.isEmpty()){
                return false;
            }
            char top=stack.pop();
            if(c==')'&& top!='(') return false;
            if(c=='}' && top!='{') return false;
            if(c==']' && top!='[') return false;
        }

       } 
       return stack.isEmpty();
    }
}
