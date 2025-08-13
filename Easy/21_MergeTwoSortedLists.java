/*
 * Problem: Merge Two Sorted Lists
 * Platform: LeetCode
 * Difficulty: Easy
 * 
 * Description:
 *   You are given the heads of two sorted linked lists list1 and list2.
 *   Merge the two lists into one sorted linked list and return its head.
 *   The merged list should be made by splicing together the nodes of the first two lists.
 * 
 * Example:
 *   Input:  list1 = [1,2,4], list2 = [1,3,4]
 *   Output: [1,1,2,3,4,4]
 * 
 * Approach:
 *   1. Use two pointers, each starting at the head of the two lists.
 *   2. Compare the current nodes and attach the smaller one to the merged list.
 *   3. Move the pointer forward in the list from which the node was taken.
 *   4. Continue until one list is fully traversed, then append the remaining nodes.
 * 
 * Time Complexity: O(n + m) — where n and m are the lengths of the two lists.
 * Space Complexity: O(1) — only pointers are used.
 * 
 */
//SOLUTION
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

      while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach remaining nodes (only one of l1 or l2 will be non-null)
        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return dummy.next; // head of merged list
    }

    }

