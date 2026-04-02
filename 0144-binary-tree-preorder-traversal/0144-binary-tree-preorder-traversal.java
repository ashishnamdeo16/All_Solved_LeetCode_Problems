class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> preOrder = new ArrayList<>();
    funcFind(root,preOrder);
    return preOrder;
    }
    public void funcFind(TreeNode node,List<Integer> preOrder){
        if(node == null) {
            return;
        }
        int val = node.val;
        preOrder.add(val);
        funcFind(node.left,preOrder);
        funcFind(node.right,preOrder);
    }
}