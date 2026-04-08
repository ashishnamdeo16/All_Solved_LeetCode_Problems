class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> finalList1 = new ArrayList<>();
        List<Integer> finalList2 = new ArrayList<>();

        funcFindLeaf(root1,finalList1);
        funcFindLeaf(root2,finalList2);

        return finalList1.equals(finalList2);
    }

    public void funcFindLeaf(TreeNode root,List<Integer> ans){
        if(root == null) return;
        if(root.left == null && root.right == null){
            ans.add(root.val);
        }
        funcFindLeaf(root.left,ans);
        funcFindLeaf(root.right,ans);
    }
}