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
    public ListNode reverseList(ListNode head){
        if(head.next == null || head == null)return head;
        
        ListNode newHead = reverseList(head.next);
        ListNode temp = head.next;
        temp.next = head;
        head.next = null;
        return newHead;
    }
    public int pairSum(ListNode head) {
        // find the middle of the linkedList
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = slow.next;
        slow.next = null;
        // reverse the second-half
        secondHalf = reverseList(secondHalf);
        
        // loop over two list and maintain maxSum
        int resultSum =Integer.MIN_VALUE;
        while(head != null && secondHalf != null){
            resultSum = Math.max(resultSum,(head.val+secondHalf.val));
            head = head.next;
            secondHalf = secondHalf.next;
        }
        return resultSum;
    }
}