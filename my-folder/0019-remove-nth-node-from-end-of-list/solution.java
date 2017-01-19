/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        HashMap<Integer,ListNode> nodeMap = new HashMap<Integer,ListNode>();
        
        int size = 0,index=1;
        
        
        
        ListNode temp = head;
        
        while (temp != null) {
            nodeMap.put(index++,temp);
            temp=temp.next;
            size++;
        }
        
        int nthNodeNumber = size-n+1;
        
        if(nthNodeNumber == 1) {
            head = head.next;
        } else if (nthNodeNumber == size) {
            ((ListNode)nodeMap.get(nthNodeNumber-1)).next = null;
        } else {
            ListNode previous = nodeMap.get(nthNodeNumber-1);
            ListNode next = nodeMap.get(nthNodeNumber+1);
            previous.next = next;
        }
        
        return head;
    }
}
