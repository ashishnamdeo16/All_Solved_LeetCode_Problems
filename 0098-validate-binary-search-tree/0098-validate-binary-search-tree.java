class Solution {
    public boolean isValidBST(TreeNode root) {
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        return checkForMe(min,root,max);
    }

    public boolean checkForMe(long min,TreeNode root,long max){
        if(root == null){
            return true;
        }
        if(root.val <= min || root.val >= max){
            return false;
        }
        return checkForMe(min,root.left,root.val) && checkForMe(root.val,root.right,max);
    }
}