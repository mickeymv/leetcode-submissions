/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null || n<=m) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode pre = dummy, start,then; //pre is the node before start of reversed list; start is the node which is the start of the reversed section.
        
        for(int i=0; i<m-1;i++) pre = pre.next;
        
        start = pre.next;
        
        for(int i=0;i<n-m && start.next!=null;i++) {
            then = start.next;
            start.next = then.next;
            then.next=pre.next;
            pre.next = then;
        }
        
        return dummy.next;
    }
}
