/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 import java.util.ArrayList;
 
public class Solution {
    
    int size=0;
    ArrayList<Integer> list = new ArrayList<>();
    
    public boolean isSymmetric(TreeNode root) {
        
        if (root==null) return true;
        
        return isMirror(root.left,root.right);
    }
    
    private boolean isMirror(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if(left==null || right==null) {
            return false;
        }
        if(left.val!=right.val) return false;
        
        return isMirror(left.left,right.right) && isMirror(right.left,left.right);
    }
    
    private void helper(TreeNode root) {
        if (root != null) {
            helper(root.left);
            size++;
            list.add(root.val);
            helper(root.right);
        } else {
            size++;
            list.add(null);
        }
        
    }
}
