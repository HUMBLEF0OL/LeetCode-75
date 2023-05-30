/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        int level = 1;
        int maxLevelSum = Integer.MIN_VALUE;
        if(root == null)return level;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int currentSum = 0;
        int currentLevel = 1;
        while(q.size() > 0){
            TreeNode current = q.remove();
            currentSum += current.val;
            if(current.left != null)q.add(current.left);
            if(current.right != null)q.add(current.right);
            // finished the current level
            if(q.peek() == null){
                if(currentSum > maxLevelSum){
                    level = currentLevel;
                    maxLevelSum = currentSum;
                }
                if(q.size() == 1)break;
                q.add(q.remove());
                currentSum = 0;
                currentLevel++;
            }
        }
        return level;
    }
}