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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        findAllPath(root,list,sb);
        return list;
    }
    public void findAllPath(TreeNode root, List<String>  list,  StringBuilder sb){
        if(root == null){
            return;
        }
        int len = sb.length(); 
        if(root.left != null || root.right != null){
            sb.append(Integer.toString(root.val));
            sb.append("->");
        }else{
            sb.append(Integer.toString(root.val));
        }

        if(root.left == null && root.right == null){
            list.add(sb.toString());
        }else{
            findAllPath(root.left,list,sb);
            findAllPath(root.right,list,sb);
        }

       sb.setLength(len);
    }


}