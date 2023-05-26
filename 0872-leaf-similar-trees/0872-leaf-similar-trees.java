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
    public ArrayList findSequence(TreeNode root){
        if(root == null)return null;
        if(root.left == null && root.right == null){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.val);
            return output;
        }
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> leftSequence = findSequence(root.left);
        if(leftSequence != null && leftSequence.size() > 0)result.addAll(leftSequence);
        ArrayList<Integer> rightSequence = findSequence(root.right);
        if(rightSequence != null && rightSequence.size() > 0)result.addAll(rightSequence);
        return result;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> firstSequence = findSequence(root1);
        ArrayList<Integer> secondSequence = findSequence(root2);
        return firstSequence.equals(secondSequence);
    }
}