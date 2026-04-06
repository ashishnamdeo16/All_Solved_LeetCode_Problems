class Solution {
    TreeNode ans = null;
    public TreeNode searchBST(TreeNode root, int val) {
        funcFind(root,val);
        return ans;
    }
    public void funcFind(TreeNode root, int val){
        if(root == null){
            return;
        }
        if(root.val == val && ans == null){
            ans = root;
        }
        funcFind(root.left,val);
        funcFind(root.right,val);
        return;
    }
}