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
    public TreeNode sortedArrayToBST(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        return giveMeBinarySearchTree(nums,l,r);
    }
    public static TreeNode giveMeBinarySearchTree(int[] nums,int l,int r){
        if(l>r){
            return null;
        }
        int mid = l + (r-l)/2;
        TreeNode a = new TreeNode(nums[mid]);
        a.left = giveMeBinarySearchTree(nums,l,mid-1); 
        a.right = giveMeBinarySearchTree(nums,mid+1,r); 
        return a;
    }
}