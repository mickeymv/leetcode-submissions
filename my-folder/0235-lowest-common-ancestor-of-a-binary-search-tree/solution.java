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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a,b;
        
        if(p.val < q.val) {
            a= p.val;
            b= q.val;
        } else {
            a= q.val;
            b= p.val;
        }
        
        if (root.val > b) {
            return lowestCommonAncestor(root.left,p,q);
        } else if (root.val < a) {
            return lowestCommonAncestor(root.right,p,q);
        }
        
        return root;
    }
}
