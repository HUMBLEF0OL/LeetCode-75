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
    public TreeNode find(TreeNode root)
    {
        if(root == null)
            return root;
        // going deep on the left side of tree
        TreeNode temp = root;
        while(temp.left!=null)
            temp = temp.left;
        return temp;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return root;
        // search on the left side of the tree
        if(root.val>key)
        {
            root.left =  deleteNode(root.left,key);
            return root;
        }
        // searching on the right of the tree
        else if(root.val<key)
        {
            root.right = deleteNode(root.right,key);
            return root;
        }
        
        if(root.val == key)
        {
            // case one( when the target node is the leaf node)
            if(root.left == null && root.right == null)
                return null;
            
            // case two( when the target node have only one child)
            // part-1
            else if(root.left == null && root.right !=null)
                return root.right;
            // part-2
            else if(root.left !=null && root.right == null)
                return root.left;
            
            // case three (when the target node have 2 children)
            else if(root.left !=null && root.right !=null)
            {
                // find the smallest in the right side of tree
                TreeNode smallest = find(root.right);
                root.val = smallest.val;
                // now delete that smallest node from the tree
                root.right = deleteNode(root.right,smallest.val);
                return root;
            }
            return root;
        }
        return root;
    }
}