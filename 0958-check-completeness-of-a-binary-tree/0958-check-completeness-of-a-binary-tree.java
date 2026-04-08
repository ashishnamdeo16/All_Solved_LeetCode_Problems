class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> pq = new LinkedList<>();
        pq.offer(root);
        boolean nullSeen = false;
        while(!pq.isEmpty()){
            TreeNode p = pq.poll();
            if(p == null){
                nullSeen = true;
            }else{
                if(nullSeen) return false;
                pq.offer(p.left);
                pq.offer(p.right);
            }
        }
        return true;
    }
}