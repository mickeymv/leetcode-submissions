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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, list);
        return list;
    }
    
    private void helper(TreeNode node, List<Integer> list) {
        if(node == null) return;
        Stack<TreeNode> s = new Stack<>();
        
        while(node!=null || !s.isEmpty()) {
            while(node!=null) {
                s.push(node);
                node = node.left;
            }
            node = s.pop();
            list.add(node.val);
            node = node.right;
        }
    }
}
