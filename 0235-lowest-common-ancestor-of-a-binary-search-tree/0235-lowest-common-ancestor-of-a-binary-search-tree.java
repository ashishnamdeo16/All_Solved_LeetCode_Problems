class Solution {
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        funcFindLCA(root,p,q);
        return ans;
    }
    public void funcFindLCA(TreeNode root, TreeNode p,TreeNode q){
        if(root == null){
            return;
        }else if(p.equals(root) || q.equals(root)){
            ans = root;
            return;
        }else if(root.val > p.val && root.val > q.val){
            funcFindLCA(root.left,p,q);
        }else if(root.val < p.val && root.val < q.val){
            funcFindLCA(root.right,p,q);
        }else{
            ans = root;
            return;
        }
    }
}