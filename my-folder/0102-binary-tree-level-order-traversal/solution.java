/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    private HashMap<Integer, LinkedList> map = new HashMap<Integer, LinkedList>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        helper(root, 1);
        List list = new LinkedList();
        
        for(int i=1;;i++) {
            if(map.containsKey(i)) {
                list.add(map.get(i));
            } else {
                break;
            }
        }
        
        return list;
    }
    
    private void helper(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        LinkedList list = null;
        if(map.containsKey(level)) {
            list = map.get(level);
        } else {
            list = new LinkedList();
        }
        list.add(node.val);
        map.put(level,list);
        helper(node.left,level+1);
        helper(node.right,level+1);
    }
}
