class Solution {
    public TreeNode invertTree(TreeNode root) {
       if(root == null) return root;
              
        TreeNode c = root.left;
        root.left = root.right;
        root.right = c;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

}