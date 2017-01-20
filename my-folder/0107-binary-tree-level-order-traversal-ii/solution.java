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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> wrapList = new ArrayList<List<Integer>>();
        if (root == null) return wrapList;
        
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);
        
        while(!queue.isEmpty()) {
            int numNodes = queue.size();
            List sublist = new ArrayList();
            for(int i=0;i<numNodes;i++) {
            TreeNode node = queue.remove();
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
            sublist.add(node.val);
            }
            wrapList.add(0,sublist);
        }

        return wrapList;
     }
}
