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
    public List<Integer> rightSideView(TreeNode root) {
        //output list
        List<Integer> output = new ArrayList<>();
        if(root == null)return output;
        
        // maintaining a queue
        Queue<TreeNode> q  = new LinkedList<>();
        // adding the roor
        q.add(root);
        // adding the delimiter
        q.add(null);
        while(q.size()>0){
            // pop the current element from queue
            TreeNode current = q.remove();
            if(current.left != null) q.add(current.left);
            if(current.right != null) q.add(current.right);
            
            if(q.peek() == null){
                output.add(current.val);
                if(q.size() == 1)break;
                q.add(q.remove());
            }
        }
        return output;
    }
}