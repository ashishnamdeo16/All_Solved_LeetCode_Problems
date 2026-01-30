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
    public int minDepth(TreeNode root) {
        return findMinDepth(root);
    }
    public int findMinDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null){
             return 1 + findMinDepth(root.right);
        }else if(root.right == null){
             return 1 + findMinDepth(root.left);
        }
        int left = findMinDepth(root.left);
        int right = findMinDepth(root.right);
        
        return 1 + Math.min(left,right);
    }
}