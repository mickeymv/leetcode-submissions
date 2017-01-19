/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode temp = dummy;
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        while(temp.next != null) {
            if(set.contains(temp.next.val)) {
                temp.next = temp.next.next;
            } else {
                set.add(temp.next.val);
                temp = temp.next;
            }
        }
        
        
        
        
        return dummy.next;
    }
}
