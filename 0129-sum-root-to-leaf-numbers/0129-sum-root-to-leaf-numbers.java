class Solution {
     int globalSum = 0;
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        findSum(root,sum);
        return globalSum;
    }

    public void findSum(TreeNode root,int sum){
        if(root == null){
            return;
        }
        
        sum = sum * 10 + root.val;

        if(root.left == null && root.right == null){
            globalSum += sum;
            return;
        }
        findSum(root.left,sum);
        findSum(root.right,sum);
    }
}