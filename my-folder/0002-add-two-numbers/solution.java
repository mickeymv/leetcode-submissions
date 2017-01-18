/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        ListNode prev = temp;
        int carry = 0;
        while (l1 != null && l2 != null) {
            temp.val = l1.val + l2.val + carry;
            if (temp.val>9) {
                carry = 1;
                temp.val = temp.val-10;
            } else {
                carry =0;
            }
            l1 = l1.next;
            l2 = l2.next;
            if(l1 != null || l2 != null || carry==1) {
            temp.next = new ListNode(0);
            temp = temp.next;
        }}
        while(l1!=null) {
            temp.val = l1.val+carry;
            if (temp.val>9) {
                carry = 1;
                temp.val = temp.val-10;
            } else {
                carry=0;
            }
            l1=l1.next;
            if(l1 != null || carry==1) {
            temp.next = new ListNode(0);
            temp = temp.next;
        }
        }
        while(l2!=null) {
            temp.val = l2.val+carry;
            if (temp.val>9) {
                carry = 1;
                temp.val = temp.val-10;
            } else {
                carry=0;
            }
            l2=l2.next;
            if(l2 != null || carry==1) {
            temp.next = new ListNode(0);
            temp = temp.next;
        }
        }
        if (carry == 1){
            temp.val = 1;
        }
        return head;
    }
}
