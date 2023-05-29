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
    int maxLength = 0;
    public int helper(TreeNode root, String direction,int currentLength){
        if(root == null)return currentLength-1;
        
        int leftMax = 0;
        int rightMax = 0;
        if(direction.equals("right")){
            leftMax = helper(root.left,"left",currentLength+1);
            rightMax = helper(root.right,"right",1);
        } else{
            rightMax = helper(root.right,"right",currentLength+1);
            leftMax = helper(root.left,"left",1);
        }
        maxLength = Math.max(maxLength, Math.max(leftMax,rightMax));
        return Math.max(leftMax,rightMax);
    }
    public int longestZigZag(TreeNode root) {
        helper(root.left,"left",1);
        helper(root.right,"right",1);
        return maxLength;
    }
}