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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return builder(0,0,preorder.length-1,preorder,inorder);
    }
    
    private TreeNode builder(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length-1 || inStart > inEnd) {
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[preStart]); //get the root
        
        int index = inStart;
        
        while(index<=inEnd) {
            if(preorder[preStart] == inorder[index]) {
                break;
            } else {
                index++;
            }
        }
        
        root.left = builder(preStart+1,inStart,index-1,preorder,inorder);
        root.right = builder(preStart+index+1-inStart,index+1,inEnd,preorder,inorder);
        
        return root;
    }
}
