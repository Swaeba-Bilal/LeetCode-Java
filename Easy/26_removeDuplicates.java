/**
 * LeetCode Problem: 26. Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * 
 * Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 
 * Description:
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates 
 * in-place such that each unique element appears only once. The relative order of the 
 * elements should be kept the same. Then return the number of unique elements.
 * 
 * Consider the first k elements of nums to be the result, where k is the number returned.
 * 
 * Do not allocate extra space — do it in-place with O(1) extra memory.
 * 
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0){
            System.out.println("Array is empty");
            return 0;
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
        
    }
}
