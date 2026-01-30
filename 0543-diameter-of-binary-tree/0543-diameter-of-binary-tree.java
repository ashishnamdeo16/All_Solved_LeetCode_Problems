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
       int dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diaForMe(root);
        return dia;
    }

    public int diaForMe(TreeNode root){
        if(root == null) return 0;
        int left = diaForMe(root.left);
        int right = diaForMe(root.right);
        dia =  Math.max(left + right ,dia);
        return 1 +  Math.max(left,right);
    }
}