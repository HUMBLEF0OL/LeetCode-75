/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public List<TreeNode> findPath(TreeNode root, TreeNode target){
        if(root == null)return null;
        if(root.val == target.val){
            List<TreeNode> temp = new ArrayList<>();
            temp.add(root);
            return temp;
        }
        
        List<TreeNode> leftSide = findPath(root.left,target);
        List<TreeNode> rightSide = findPath(root.right,target);
        if(leftSide != null){
            leftSide.add(root);
            return leftSide;
        } else if(rightSide != null){
            rightSide.add(root);
            return rightSide;
        }
        return null;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> leftPath = findPath(root,p);
        List<TreeNode> rightPath = findPath(root,q);
        
        Collections.reverse(leftPath);
        Collections.reverse(rightPath);
        int i =0;
        for(i =0;i<leftPath.size() && i<rightPath.size();i++){
            if(leftPath.get(i) != rightPath.get(i)) break;
        }
        return leftPath.get(i-1);
        
    }
}