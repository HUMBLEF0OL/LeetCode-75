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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)return null;
        if(root.val == val)return root;
        TreeNode leftSide = searchBST(root.left,val);
        if(leftSide !=null)return leftSide;
        TreeNode rightSide = searchBST(root.right,val);
        if(rightSide != null)return rightSide;
        return null;
    }
}