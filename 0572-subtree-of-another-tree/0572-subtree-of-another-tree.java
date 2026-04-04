class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null ) return false;
        if(root == null || subRoot == null) return false;
        if(root.val == subRoot.val){
           if (isSame(root, subRoot)) return true;
        }
        if(isSubtree(root.left,subRoot)) return true;
        return isSubtree(root.right,subRoot);
    }
    public boolean isSame(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.val != b.val) return false;

        return isSame(a.left, b.left) && isSame(a.right, b.right);
    }
}