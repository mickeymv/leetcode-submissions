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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listOfLevels = new ArrayList<List<Integer>>();
        if (root == null) return  listOfLevels;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(root);
        
        while(!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> levelList = new ArrayList<>();;
            while(levelSize>0) {
                TreeNode node = q.poll();
                levelList.add(node.val);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
                levelSize--;
            }
            listOfLevels.add(levelList);
        }
        
        return  listOfLevels;
    }
}
