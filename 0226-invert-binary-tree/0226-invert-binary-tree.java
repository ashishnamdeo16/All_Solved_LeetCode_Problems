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
    public TreeNode invertTree(TreeNode root) {
      return invertForMe(root);
    }

    public TreeNode invertForMe(TreeNode p){
        if(p == null) return p;
        TreeNode temp = p.right;
        p.right = p.left;
        p.left = temp;
        invertForMe(p.left);
        invertForMe(p.right);
        return p;
    }    
}