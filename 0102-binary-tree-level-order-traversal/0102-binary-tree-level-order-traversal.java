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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> newQueue = new ArrayDeque<>();
        List<List<Integer>> mainList = new ArrayList<>();
        if(root == null){
            return mainList;
        }
        newQueue.offer(root);
        while(!newQueue.isEmpty()){
            int level = newQueue.size();
            List<Integer> children = new ArrayList<>();
            for(int i=0;i<level;i++){
                if(newQueue.peek().left != null){
                    newQueue.offer(newQueue.peek().left);
                }
                if(newQueue.peek().right != null){
                    newQueue.offer(newQueue.peek().right);
                }
                children.add(newQueue.poll().val);
            }
            mainList.add(children);
        }
        
        return mainList;
    }
}