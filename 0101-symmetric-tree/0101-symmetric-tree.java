class Solution {
    public boolean isSymmetric(TreeNode root) {
      if(root == null) return true;  
      return checkForSym(root.left,root.right);
    }

    public boolean checkForSym(TreeNode p,TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        boolean left = checkForSym(p.left,q.right);
        boolean right = checkForSym(p.right,q.left);
        return (left && right);
     }
}