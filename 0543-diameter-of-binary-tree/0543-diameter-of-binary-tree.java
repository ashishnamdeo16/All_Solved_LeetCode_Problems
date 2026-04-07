class Solution {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       findHeight(root);
       return res;
    }
    public int findHeight(TreeNode root){
        if(root == null) return 0;
        int left = findHeight(root.left);
        int right = findHeight(root.right);
        int sum = left + right;
        res = Math.max(sum,res);
         return 1 +  Math.max(left,right);
    }
}