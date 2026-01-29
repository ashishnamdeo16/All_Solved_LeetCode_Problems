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
    public boolean isSameTree(TreeNode p, TreeNode q) {
    return checkForMe(p,q);
    }
    public boolean checkForMe(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        } 
        if((p != null && q == null) || (q != null && p == null)){
            return false;
        }
        if(p.val != q.val) return false;
        if(checkForMe(p.left,q.left) && checkForMe(p.right,q.right)) return true;
        return false;
    }
}