/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        
        return helper(head);
    }
    
    private ListNode helper(ListNode a) {
        if (a == null || a.next == null) return a;
        
        ListNode b = a.next;
        a.next = b.next;
        b.next = a;
        
        a.next = helper(a.next);
        
        return b;
    }
}
