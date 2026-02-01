class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> finalList = new ArrayList<>();
        findRightSideView(root,0,finalList);
        return finalList;
    }
    public void findRightSideView(TreeNode root,int depth,List<Integer> finalList){
        if(root == null) return;
        if(depth == finalList.size()) finalList.add(root.val);
        findRightSideView(root.right,depth+1,finalList);
        findRightSideView(root.left,depth+1,finalList);
    }

}