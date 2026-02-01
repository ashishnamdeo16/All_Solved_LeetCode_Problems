class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> finalList = new ArrayList<>();
        dfs(root,finalList);
        return finalList;
    }
    public void dfs(TreeNode root, List<Integer> finalList){
        if(root == null) return;
        finalList.add(root.val);
        dfs(root.left,finalList);
        dfs(root.right,finalList);
    }
}