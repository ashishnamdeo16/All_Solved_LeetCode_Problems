class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return find(root,targetSum,sum);
    }

    public boolean find(TreeNode root, int targetSum,int sum ){
        if(root == null) return false;
        sum += root.val;

        if(root.left == null && root.right == null){
            return targetSum == sum;
        }

        if(find(root.left ,targetSum,sum)){
            return true;
        }

        if(find(root.right,targetSum,sum)){
            return true;
        }
        
        return false;
    }
}