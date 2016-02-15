/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead=null, oddTail=null, evenHead=null, evenTail=null;
        int i=1;
        while(head != null) {
            if(i%2 !=0) {
                if (i==1) {
                    oddHead = head;
                    oddTail = head;
                } else {
                oddTail.next = head;
                oddTail = head;
                }
            } else {
                if (i==2) {
                    evenHead = head;
                    evenTail = head;
                } else {
                evenTail.next = head;
                evenTail = head;
                }
            }
            head = head.next;
            i++;
        }
            head = oddHead;
            if (evenHead != null) {
            oddTail.next=evenHead;
            }
            if(evenTail != null) {
                evenTail.next = null;
            }
        
        return head;
    }
}
