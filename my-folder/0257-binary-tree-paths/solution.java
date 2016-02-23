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
    ArrayList<String> list=new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root!=null) {
            if(root.left!=null){
        addRootToLeafPath(root.left,root.val+"->");
            }
            if(root.right!=null){
        addRootToLeafPath(root.right,root.val+"->");
            }
            if(root.left==null && root.right==null){
                list.add(""+root.val);
            }
    }
        return list;
    }
    
    public void addRootToLeafPath(TreeNode node,String path) {
        if(node!=null ){
            if(node.left!=null){
        addRootToLeafPath(node.left,path+node.val+"->");
            } 
            if(node.right!=null){
        addRootToLeafPath(node.right,path+node.val+"->");
            } 
            
            if(node.left==null && node.right==null){
                list.add(path+node.val);
            }
        }
    }
}
