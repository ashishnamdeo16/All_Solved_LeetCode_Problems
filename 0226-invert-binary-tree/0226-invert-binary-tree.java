class Solution {
    public TreeNode invertTree(TreeNode root) {
      if(root == null) return root;
       treeInversion(root);
       return root;
    }
    public void treeInversion(TreeNode p){
        if(p == null){
            return;
        }   
        treeInversion(p.left);
        treeInversion(p.right);
        TreeNode c = p.left;
        p.left = p.right;
        p.right = c;
    }
}