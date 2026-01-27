/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int sum = 0;
        findAllPaths(root,targetSum,sum,temp,finalList);
        return finalList;
    }

    public void findAllPaths(TreeNode root,int targetSum,int sum,List<Integer>  temp,List<List<Integer>> finalList){
        if(root == null){
            return;
        }
        sum += root.val;
        temp.add(root.val);
        if(root.left == null && root.right == null){
            if(sum == targetSum){
                finalList.add(List.copyOf(temp));
            }
        }else {
            findAllPaths(root.left,targetSum,sum,temp,finalList);
            findAllPaths(root.right,targetSum,sum,temp,finalList);
        }
        temp.remove(temp.size()-1);
    }
}