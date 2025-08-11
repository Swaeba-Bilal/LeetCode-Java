/*
 * Problem: Min Stack
 * Platform: LeetCode
 * Difficulty: Medium
 * 
 * Description:
 *   Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *   Implemented using two stacks:
 *     1. Main stack to store all elements.
 *     2. Min stack to track the current minimum at each push.
 * 
 * Example:
 *   Input:
 *     ["MinStack","push","push","push","getMin","pop","top","getMin"]
 *     [[],[-2],[0],[-3],[],[],[],[]]
 *   Output:
 *     [null,null,null,null,-3,null,0,-2]
 * 
 * Approach:
 *   1. Push element onto the main stack.
 *   2. Push onto the min stack if it is empty or the new element is <= current min.
 *   3. On pop, remove from min stack if the popped value equals current min.
 *   4. getMin() returns the top of the min stack.
 * 
 * Time Complexity: O(1) for all operations.
 * Space Complexity: O(n) — for storing elements in both stacks.
 * 
 */
//SOLUTION
class MinStack {
Stack<Integer> main;
Stack<Integer> min;
    public MinStack() {
       main= new Stack();
       min=new Stack();
    }
    public void push(int val) {
        main.push(val);
        if(min.isEmpty() || val<=min.peek()){
            min.push(val);
        }
        else{
            min.push(min.peek());
        }
    }
    public void pop() {
        if(!main.isEmpty()){
            main.pop();
            min.pop();

        }
    }
    public int top() {
        return main.peek();
    }
    public int getMin() {
        return min.peek(); }}
