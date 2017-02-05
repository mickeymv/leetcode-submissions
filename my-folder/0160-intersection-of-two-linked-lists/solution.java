/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
    
        if(headA == headB) return headA;
        
        ListNode pA = headA,pB=headB;
        
        HashSet<ListNode> seen = new HashSet<>();
        
        while(pA!=null) {
            seen.add(pA);
            pA = pA.next;
        }
        
        while(pB!=null) {
            if(seen.contains(pB)) {
                return pB;
            }
            pB=pB.next;
        }
        return null;
    }
}
