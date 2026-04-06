class Solution {
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       funcLCA(root,p,q);
       return ans;
    }
    public int funcLCA(TreeNode root,TreeNode p,TreeNode q){
        if(root == null){
            return 0;
        }
        int left = funcLCA(root.left,p,q);
        int right = funcLCA(root.right,p,q);
        int self = 0;
        if(p.equals(root) || q.equals(root)){
            self = 1;
        }
        int total = left + right + self;
        if(total == 2 && ans == null){
            ans = root;
        }
        return total;
    }
}