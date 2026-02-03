class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        return dfs(root,val);
    }
    public TreeNode dfs(TreeNode root, int target){
        if(root == null){
            return null;
        }
        if(root.val == target){
            return root;
        }
        TreeNode left = dfs(root.left,target);
        TreeNode right = dfs(root.right,target);
        if(left != null){
            return left;
        }else if(right != null){
            return right;
        }
        return null;
    }
}