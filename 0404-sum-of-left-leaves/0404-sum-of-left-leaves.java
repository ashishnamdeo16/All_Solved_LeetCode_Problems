class Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
       boolean isLeft = false;
       findSum(root,isLeft);
       return sum;
    }

    public void findSum(TreeNode root,boolean isLeft){
        if(root == null) return;
        if(root.left == null && root.right == null){
            if(isLeft) {
                sum += root.val;
            }
        }
        findSum(root.left,true);
        findSum(root.right,false);
    }
}