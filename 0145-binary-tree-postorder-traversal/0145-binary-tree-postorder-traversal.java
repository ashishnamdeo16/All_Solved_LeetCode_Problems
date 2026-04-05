class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> finalList = new ArrayList<>();
        dfs(root,finalList);
        return finalList;
    }
    public void dfs(TreeNode root,List<Integer> finalList){
        if(root == null) return;
        dfs(root.left,finalList);
        dfs(root.right,finalList);
        finalList.add(root.val);
    }
}