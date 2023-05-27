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
    int path = 0;
    public int pathFinder(TreeNode root,int target,long current)
    {
        if(root == null)return 0;
        current += root.val;
        int result = 0;
        if(current == target) result = 1;
        return result + pathFinder(root.left,target,current) + pathFinder(root.right,target,current);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null)return 0;
        return pathSum(root.left,targetSum)+pathSum(root.right,targetSum)+pathFinder(root,targetSum,0L);
    }
}