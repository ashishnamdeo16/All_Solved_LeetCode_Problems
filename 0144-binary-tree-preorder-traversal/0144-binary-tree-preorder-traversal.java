class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> finalList = new ArrayList<>();
        dfs(root,0,finalList);
        return finalList;
    }
    public void dfs(TreeNode root,int depth, List<Integer> finalList){
        if(root == null) return;
        finalList.add(root.val);
        dfs(root.left,depth+1,finalList);
        dfs(root.right,depth+1,finalList);
    }
}