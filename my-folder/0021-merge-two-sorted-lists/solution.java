/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        
        ListNode temp = dummy;
        
        while (l1 != null && l2 != null) {
            int a = 0;
            if(l1.val < l2.val) {
                a= l1.val;
                l1 = l1.next;
            } else {
                a= l2.val;
                l2 = l2.next;
            }
            temp.next = new ListNode(a);
            temp=temp.next;
        }
        
        ListNode rem=null;
        
        rem= l1 != null ? l1 : l2;
        
        while(rem != null) {
            temp.next = new ListNode(rem.val);
            rem = rem.next;
            temp=temp.next;
        }
        
        return dummy.next;
    }
}
